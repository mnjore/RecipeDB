package com.example.recipe.database

import com.example.recipe.Recipe

data class RecipeState(
    val recipes: List<Recipe> = emptyList(),
    val Name: String = "",
    val Type: String = "",
    val Servings: Int = 0,
    val Difficulty: String = "",
    val Ingredients: String = "",
    val Steps: String = "",
    val ImageId: Int = 0,
    val isAddingRecipe: Boolean = false,
    val sortType: SortType = SortType.NAME
)
