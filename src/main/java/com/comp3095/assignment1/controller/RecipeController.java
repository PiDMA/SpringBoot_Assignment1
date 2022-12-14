package com.comp3095.assignment1.controller;

import com.comp3095.assignment1.model.Recipe;
import com.comp3095.assignment1.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @PostMapping("/recipe")
    public Recipe saveRecipe(@RequestBody Recipe recipe){
        return recipeService.saveRecipe(recipe);
    }


    // Read operation
    @GetMapping("/recipe")

        public String fetchUserList(Model model) {

        model.addAttribute("recipe", recipeService.fetchRecipeList());
        return "test";



    }

    // Update operation
  /*  @GetMapping("/recipe/{id}")
    public Recipe
    getRecipe(
                     @PathVariable("id") Long departmentId)
    {
        return recipeService.(
                department, departmentId);
    }*/

    // Delete operation
    @DeleteMapping("/recipe/{id}")
    public String deleteRecipe(@PathVariable("id")
                                       Long recipeId)
    {
        recipeService.deleteRecipeById(
                recipeId);
        return "Deleted Successfully";
    }
}
