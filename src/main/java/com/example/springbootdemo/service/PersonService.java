package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.PersonDao;
import com.example.springbootdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        personDao.insertPerson(person);
        return 1;
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }
}
