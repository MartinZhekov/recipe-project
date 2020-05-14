package com.martinzhekov.recepieproject.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by martinzhekov on 14.05.20
 */


@Entity(name = "categories")
public class Category {

    private Long id;
    private String description;
    private Set<Recipe> recipes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToMany(mappedBy = "categories")
    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
