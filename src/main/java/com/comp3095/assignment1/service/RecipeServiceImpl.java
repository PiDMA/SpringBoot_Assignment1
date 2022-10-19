package com.comp3095.assignment1.service;

import com.comp3095.assignment1.model.Recipe;
import com.comp3095.assignment1.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class RecipeServiceImpl
        implements RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    // Save operation
    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    // Read operation
    @Override
    public List<Recipe> fetchRecipeList() {
        return (List<Recipe>)
                recipeRepository.findAll();
    }


    // Delete operation
    @Override
    public void deleteRecipeById(Long recipeId) {
        recipeRepository.deleteById(recipeId);
    }
}