package com.comp3095.assignment1.service;

import com.comp3095.assignment1.model.Recipe;

import java.util.List;

public interface RecipeService {
    // Save operation
    Recipe saveRecipe(Recipe recipe);

    // Read operation
    List<Recipe> fetchRecipeList();



    // Delete operation
    void deleteRecipeById(Long recipeId);

}
