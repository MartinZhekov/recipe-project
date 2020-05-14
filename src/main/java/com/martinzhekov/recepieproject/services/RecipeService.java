package com.martinzhekov.recepieproject.services;

import com.martinzhekov.recepieproject.domain.Recipe;

import java.util.Set;

/**
 * Created by martinzhekov on 14.05.20
 */


public interface RecipeService {

    Set<Recipe> getRecipes();
}
