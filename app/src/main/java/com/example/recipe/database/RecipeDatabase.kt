package com.example.recipe.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.recipe.Recipe

@Database(
    entities = [Recipe::class],
    version = 1,
    exportSchema = true
)
abstract class RecipeDatabase: RoomDatabase() {

    abstract val dao: RecipeDao

}