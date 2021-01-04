package com.example.springbootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * This initiates the Person Model.
 */
public class Person {
    // Class Attributes
    private final UUID id;
    private final String name;

    /**
     * Class Constructor for the Person Model class.
     * @param id The Person ID
     * @param name The Person Name
     */
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the Person ID
     * @return The Person ID
     */
    public UUID getId() {
        return id;
    }

    /**
     * Returns the Person Name
     * @return The Person Name
     */
    public String getName() {
        return name;
    }
}
