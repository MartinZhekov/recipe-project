package com.martinzhekov.recepieproject.converters;

import com.martinzhekov.recepieproject.commands.IngredientCommand;
import com.martinzhekov.recepieproject.domain.Ingredient;
import com.martinzhekov.recepieproject.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class IngredientToIngredientCommandTest {

    private static final Long ID_VALUE = 1L;
    private static final String DESC = "desc";
    private static final BigDecimal AMOUNT = new BigDecimal(3);
    private static final Long UOM_ID = 1L;
    IngredientToIngredientCommand converter;

    @Before
    public void setUp() {
        converter = new IngredientToIngredientCommand(new UnitOfMeasureToUnitOfMeasureCommand());
    }

    @Test
    public void testNullObject() {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new Ingredient()));
    }

    @Test
    public void convert() {
        //given
        Ingredient ingredient = new Ingredient();
        ingredient.setId(ID_VALUE);
        ingredient.setDescription(DESC);
        ingredient.setAmount(AMOUNT);
        UnitOfMeasure unitOfMeasure = new UnitOfMeasure();
        unitOfMeasure.setId(UOM_ID);
        ingredient.setUom(unitOfMeasure);

        //when
        IngredientCommand ingredientCommand = converter.convert(ingredient);

        //then
        assertNotNull(ingredient);
        assertNotNull(ingredient.getUom());
//        assert ingredientCommand != null;
        assertEquals(ID_VALUE, ingredientCommand.getId());
        assertEquals(DESC, ingredientCommand.getDescription());
        assertEquals(AMOUNT, ingredientCommand.getAmount());
        assertEquals(UOM_ID, ingredientCommand.getUom().getId());
    }

    @Test
    public void convertWithNullUOM() {
        //given
        Ingredient ingredient = new Ingredient();
        ingredient.setId(ID_VALUE);
        ingredient.setDescription(DESC);
        ingredient.setAmount(AMOUNT);


        //when
        IngredientCommand ingredientCommand = converter.convert(ingredient);

        //then
        assertNotNull(ingredient);
        assertNull(ingredient.getUom());
//        assert ingredientCommand != null;
        assertEquals(ID_VALUE, ingredientCommand.getId());
        assertEquals(DESC, ingredientCommand.getDescription());
        assertEquals(AMOUNT, ingredientCommand.getAmount());

    }
}