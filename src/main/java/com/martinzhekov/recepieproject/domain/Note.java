package com.martinzhekov.recepieproject.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by martinzhekov on 14.05.20
 */


@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;

}
