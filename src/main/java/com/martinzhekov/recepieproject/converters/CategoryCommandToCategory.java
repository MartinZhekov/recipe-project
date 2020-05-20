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
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if(source == null)
            return null;

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;

    }
}
