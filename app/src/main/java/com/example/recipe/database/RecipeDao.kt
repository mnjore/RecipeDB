package com.example.recipe.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.recipe.Recipe
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {

    @Upsert
    suspend fun upsertRecipe(recipe: Recipe)

    @Delete
    suspend fun deleteRecipe(recipe: Recipe)

    @Query("SELECT * FROM recipe ORDER BY Name ASC")
    fun getRecipeOrderedByName(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY Type ASC")
    fun getRecipeOrderedByType(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY Servings ASC")
    fun getRecipeOrderedByServings(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY Difficulty ASC")
    fun getRecipeOrderedByDifficulty(): Flow<List<Recipe>>

}