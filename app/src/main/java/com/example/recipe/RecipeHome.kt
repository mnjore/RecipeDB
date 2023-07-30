package com.example.recipe

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun RecipeHomeContent(navigateToProfile: (Recipe) -> Unit) {
    val recipes = remember { DataProvider.recipeList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = recipes,
            itemContent = {
                RecipeListItem(recipe = it, navigateToProfile)
            })
    }
}