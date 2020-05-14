package com.martinzhekov.recepieproject.domain;

import javax.persistence.*;

/**
 * Created by martinzhekov on 14.05.20
 */


@Entity(name = "notes")
public class Note {

    private Long id;
    private Recipe recipe;
    private String recipeNotes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne
    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Lob
    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
