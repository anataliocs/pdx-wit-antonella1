package com.example.demo.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="dog")
public class DogEntity {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public DogEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DogEntity setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public DogEntity setAge(int age) {
        this.age = age;
        return this;
    }
}
