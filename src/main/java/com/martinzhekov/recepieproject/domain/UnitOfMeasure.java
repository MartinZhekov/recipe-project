package com.martinzhekov.recepieproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by martinzhekov on 14.05.20
 */


@Getter
@Setter
@Entity(name = "units_of_measure")
public class UnitOfMeasure {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public UnitOfMeasure() {
    }

    public UnitOfMeasure(String description) {
        this.description = description;
    }
}
