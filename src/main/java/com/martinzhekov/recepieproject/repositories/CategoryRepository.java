package com.martinzhekov.recepieproject.repositories;

import com.martinzhekov.recepieproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by martinzhekov on 14.05.20
 */


public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
