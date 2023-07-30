package com.example.recipe

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val recipeId: Int = 0,
    val Name: String,
    val Type: String,
    val Servings: Int,
    val Difficulty: String,
    val Ingredients: String,
    val Steps: String,
    val ImageId: Int = 0
) : Serializable