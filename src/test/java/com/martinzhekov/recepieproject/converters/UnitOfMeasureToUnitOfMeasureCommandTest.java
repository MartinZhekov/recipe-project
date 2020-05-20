package com.martinzhekov.recepieproject.converters;

import com.martinzhekov.recepieproject.commands.UnitOfMeasureCommand;
import com.martinzhekov.recepieproject.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitOfMeasureToUnitOfMeasureCommandTest {

    private static final Long ID_VALUE = 1L;
    private static final String DESC = "desc";
    UnitOfMeasureToUnitOfMeasureCommand converter;

    @Before
    public void setUp() {
        converter = new UnitOfMeasureToUnitOfMeasureCommand();
    }

    @Test
    public void testNullObject() {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new UnitOfMeasure()));
    }

    @Test
    public void convert() {
        //given
        UnitOfMeasure unitOfMeasure = new UnitOfMeasure();
        unitOfMeasure.setId(ID_VALUE);
        unitOfMeasure.setDescription(DESC);

        //when
        UnitOfMeasureCommand unitOfMeasureCommand = converter.convert(unitOfMeasure);

        //then
        assertEquals(ID_VALUE, unitOfMeasureCommand.getId());
        assertEquals(DESC, unitOfMeasureCommand.getDescription());

    }
}