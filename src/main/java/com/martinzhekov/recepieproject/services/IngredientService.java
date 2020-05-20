package com.martinzhekov.recepieproject.services;

import com.martinzhekov.recepieproject.commands.IngredientCommand;

/**
 * Created by martinzhekov on 19.05.20
 */


public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
