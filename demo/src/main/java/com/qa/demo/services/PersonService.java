package com.qa.demo.services;


import com.qa.demo.entities.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private List<Person> people = new ArrayList<>();


    public List<Person> getAll() {
        return this.people;
    }



    public Person createPerson(Person person) {
        this.people.add(person);
        return this.people.get(this.people.size() - 1);
    }


    public Person removePerson(int id) {
        return this.people.remove(id);
    }


    public Person updatePerson(int id,
                               String name,
                               Integer age,
                               String job) {
        Person toUpdate = this.people.get(id);

        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (job != null) toUpdate.setJob(job);

        return toUpdate;
    }


    public Person getById(int id){
        return this.people.get(id);
    }
}
