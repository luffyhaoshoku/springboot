package com.qa.demo.rest;

import com.qa.demo.entities.Person;
import com.qa.demo.services.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service) {

    this.service =service;
    }


    @GetMapping("/getAll")
    public List<Person> getAll() {
        return this.service.getAll();
    }


    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        return this.service.createPerson(person);
    }

    @DeleteMapping("/remove/{id}")
    public Person removePerson(int id) {
        return this.service.removePerson(id);
    }

    @PatchMapping("/update/{id}")
    public Person updatePerson(@PathVariable int id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) Integer age,
                               @RequestParam(required = false) String job) {
        Person toUpdate = this.service.updatePerson(id, name, age, job);

        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (job != null) toUpdate.setJob(job);

        return toUpdate;
    }

        @GetMapping("/getById/{id}")
        public Person getById(int id){
        return this.service.getById(id);
    }



}

