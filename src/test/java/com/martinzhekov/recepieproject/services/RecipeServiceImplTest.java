package com.martinzhekov.recepieproject.services;

import com.martinzhekov.recepieproject.converters.RecipeCommandToRecipe;
import com.martinzhekov.recepieproject.converters.RecipeToRecipeCommand;
import com.martinzhekov.recepieproject.domain.Recipe;
import com.martinzhekov.recepieproject.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;
    @Mock
    RecipeRepository recipeRepository;
    @Mock
    RecipeCommandToRecipe recipeCommandToRecipe;
    @Mock
    RecipeToRecipeCommand recipeToRecipeCommand;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
    }

    @Test
    public void getRecipesTest() throws Exception {
        Recipe recipe = new Recipe();
        HashSet recipeHasSet = new HashSet<Recipe>();
        recipeHasSet.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipeHasSet);

        Set<Recipe> recipeSet = recipeService.getRecipes();
        assertEquals(recipeSet.size(), 1);
        verify(recipeRepository, times(1)).findAll();
        verify(recipeRepository, never()).findById(anyLong());
    }

    @Test
    public void getRecipeByIdTest() {
        Recipe recipe = new Recipe();
        recipe.setId(1L);
        Optional<Recipe> recipeOptional = Optional.of(recipe);

        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);

        Recipe recipeReturned = recipeService.findById(1L);

        assertNotNull(String.valueOf(recipeReturned), "Null recipe returned");
        verify(recipeRepository, times(1)).findById(anyLong());
        verify(recipeRepository, never()).findAll();

    }

    @Test
    public void testDeleteRecipeId() {
        Long idToDelete = 2L;
        recipeService.deleteById(idToDelete);
        // no 'when' since method has return type as void
        verify(recipeRepository, times(1)).deleteById(anyLong());
    }
}