package com.martinzhekov.recepieproject.converters;

import com.martinzhekov.recepieproject.commands.UnitOfMeasureCommand;
import com.martinzhekov.recepieproject.domain.UnitOfMeasure;
import com.sun.istack.Nullable;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by martinzhekov on 19.05.20
 */

@Component
public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure> {
    
    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand source){
        if(source == null){
            return null;
        }

        final UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(source.getId());
        uom.setDescription(source.getDescription());
        return uom;
    }


}
