package com.qa.demo.rest;

import com.qa.demo.entities.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private List<Person> people = new ArrayList<>();

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return this.people;
    }


    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        this.people.add(person);
        return this.people.get(this.people.size() - 1);
    }

    @DeleteMapping("/remove/{id}")
    public Person removePerson(int id) {
        return this.people.remove(id);
    }

    @PatchMapping("/update/{id}")
    public Person updatePerson(@PathVariable int id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) Integer age,
                               @RequestParam(required = false) String job) {
        Person toUpdate = this.people.get(id);

        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (job != null) toUpdate.setJob(job);

        return toUpdate;
    }

        @GetMapping("/getById/{id}")
        public Person getById(int id){
        return this.people.get(id);
    }



}

