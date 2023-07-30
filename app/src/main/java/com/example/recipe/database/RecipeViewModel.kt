package com.example.recipe.database

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipe.Recipe
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
class RecipeViewModel(
    private val dao: RecipeDao
): ViewModel() {
    private val _sortType = MutableStateFlow(SortType.NAME)
    private val _recipes = _sortType
        .flatMapLatest { sortType ->
            when(sortType){
                SortType.NAME -> dao.getRecipeOrderedByName()
                SortType.TYPE -> dao.getRecipeOrderedByType()
                SortType.SERVINGS -> dao.getRecipeOrderedByServings()
                SortType.DIFFICULTY -> dao.getRecipeOrderedByDifficulty()
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())

    private val _state = MutableStateFlow(RecipeState())
    val state = combine(_state, _sortType, _recipes) { state, sortType, recipes ->
        state.copy(
            recipes = recipes,
            sortType = sortType
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), RecipeState())

    fun onEvent(event: RecipeEvent) {
        when (event) {
            is RecipeEvent.DeleteRecipe -> {
                viewModelScope.launch {
                    dao.deleteRecipe(event.recipe)
                }
            }
            RecipeEvent.HideDialog -> {
                _state.update { it.copy(
                    isAddingRecipe = false
                ) }
            }
            RecipeEvent.SaveRecipe -> {
                val Name = state.value.Name
                val Type = state.value.Type
                val Servings = state.value.Servings
                val Difficulty = state.value.Difficulty
                val Ingredients = state.value.Ingredients
                val Steps = state.value.Steps
                val ImageId = state.value.ImageId

                if(Name.isBlank() || Type.isBlank() || Difficulty.isBlank()) {
                    return
                }

                val recipe = Recipe(
                    Name = Name,
                    Type = Type,
                    Servings = Servings,
                    Difficulty = Difficulty,
                    Ingredients = Ingredients,
                    Steps = Steps,
                    ImageId = ImageId
                )
                viewModelScope.launch {
                    dao.upsertRecipe(recipe)
                }
                _state.update { it.copy(
                    isAddingRecipe = false,
                    Name = "",
                    Type = "",
                    Servings = 0,
                    Difficulty = "",
                    Ingredients = "",
                    Steps = "",
                    ImageId = 0
                ) }
            }
            is RecipeEvent.SetDifficulty -> {
                _state.update { it.copy(
                    Difficulty = event.Difficulty
                ) }
            }
            is RecipeEvent.SetIngredients -> {
                _state.update { it.copy(
                    Ingredients = event.Ingredients
                ) }
            }
            is RecipeEvent.SetImageId -> {
                _state.update { it.copy(
                    ImageId = event.ImageId.toInt()
                ) }
            }
            is RecipeEvent.SetName -> {
                _state.update { it.copy(
                    Name = event.Name
                ) }
            }
            is RecipeEvent.SetServings -> {
                _state.update { it.copy(
                    Servings = event.Servings.toInt()
                ) }
            }
            is RecipeEvent.SetSteps -> {
                _state.update { it.copy(
                        Steps = event.Steps
                    ) }
            }
            is RecipeEvent.SetType -> {
                _state.update { it.copy(
                        Type = event.Type
                    ) }
            }
            RecipeEvent.ShowDialog -> {
                _state.update {it.copy(
                        isAddingRecipe = true
                    ) }
            }
            is RecipeEvent.SortRecipes -> {
                _sortType.value = event.sortType
            }
        }
    }
}