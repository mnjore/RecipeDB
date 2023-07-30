package com.example.recipe.database

import com.example.recipe.Recipe

sealed interface RecipeEvent{

    object SaveRecipe: RecipeEvent
    data class SetName(val Name: String): RecipeEvent
    data class SetType(val Type: String): RecipeEvent
    data class SetServings(val Servings: String): RecipeEvent
    data class SetDifficulty(val Difficulty: String): RecipeEvent
    data class SetIngredients(val Ingredients: String): RecipeEvent
    data class SetSteps(val Steps: String): RecipeEvent
    data class SetImageId(val ImageId: Int): RecipeEvent
    object ShowDialog: RecipeEvent
    object HideDialog: RecipeEvent
    data class SortRecipes(val sortType: SortType): RecipeEvent
    data class DeleteRecipe(val recipe: Recipe): RecipeEvent
}