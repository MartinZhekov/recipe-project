package com.martinzhekov.recepieproject.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by martinzhekov on 14.05.20
 */


@Data
@Entity(name = "units_of_measure")
public class UnitOfMeasure {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
