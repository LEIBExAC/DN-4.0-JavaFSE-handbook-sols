package com.cognizant.orm_learn.model;

import com.cognizant.orm_learn.model.Country;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "languages")
    private Set<Country> countries;

    public Language() {}

    public Language(String name) {
        this.name = name;
    }

    // Getters & Setters
}
