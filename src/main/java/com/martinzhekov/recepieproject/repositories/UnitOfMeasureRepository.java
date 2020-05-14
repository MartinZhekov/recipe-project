package com.martinzhekov.recepieproject.repositories;

import com.martinzhekov.recepieproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by martinzhekov on 14.05.20
 */


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
