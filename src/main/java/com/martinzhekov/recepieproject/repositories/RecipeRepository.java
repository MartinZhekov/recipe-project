package com.martinzhekov.recepieproject.repositories;

import com.martinzhekov.recepieproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martinzhekov on 14.05.20
 */


public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
