package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.PersonDao;
import com.example.springbootdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("postgres") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        personDao.insertPerson(person);
        return 1;
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonByID(UUID id) {
        return personDao.selectPersonByID(id);
    }

    public int deletePersonByID(UUID id) {
        return personDao.deletePersonByID(id);
    }

    public int updatePersonByID(UUID id, Person person) {
        return personDao.updatePersonByID(id, person);
    }
}
