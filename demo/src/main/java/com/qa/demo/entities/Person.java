package com.qa.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Column(name = "full_name", nullable = false, unique = true)
    private String name;
    private int age;
    private String job;


    private Integer id;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    //Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    @Id
    @GeneratedValue
    public Integer getId() { return id;}


    //Setters
    public void setName(String name) {
        this.name =name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setId(Integer id) { this.id = id;}




}
