package com.martinzhekov.recepieproject.services;

import com.martinzhekov.recepieproject.domain.Recipe;
import com.martinzhekov.recepieproject.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by martinzhekov on 14.05.20
 */

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();

        this.recipeRepository
                .findAll()
                .iterator()
                .forEachRemaining(recipes::add);
        return recipes;
    }
}
