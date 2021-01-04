package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.Person;

import java.util.List;
import java.util.UUID;

/**
 * The interface for interacting with the Person Model.
 */
public interface PersonDao {

    int insertPerson(UUID id, Person person);

    /**
     * Inserts a new Person
     * @param person The Person object to insert
     * @return Calls the interface insertPerson function
     */
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
}
