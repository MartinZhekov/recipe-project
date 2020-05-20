package com.martinzhekov.recepieproject.converters;

import com.martinzhekov.recepieproject.commands.CategoryCommand;
import com.martinzhekov.recepieproject.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by martinzhekov on 19.05.20
 */


@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {


    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if(source == null)
            return null;

        final CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(source.getId());
        categoryCommand.setDescription(source.getDescription());
        return categoryCommand;
    }
}
