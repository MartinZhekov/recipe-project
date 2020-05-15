package com.martinzhekov.recepieproject.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by martinzhekov on 14.05.20
 */


@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity(name = "categories")
public class Category {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
