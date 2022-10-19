package com.comp3095.assignment1.repository;

import com.comp3095.assignment1.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository
     extends CrudRepository<Recipe, Long>{}