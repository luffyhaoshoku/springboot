package com.qa.demo.entities;


import jakarta.persistence.Entity;

@Entity
public class Person {

    private String name;
    private int age;
    private String job;

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






}
