package com.martinzhekov.recepieproject.repositories;

import com.martinzhekov.recepieproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martinzhekov on 14.05.20
 */


public interface CategoryRepository extends CrudRepository<Category, Long> {
}
