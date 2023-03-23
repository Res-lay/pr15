package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.script.ScriptEngine;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String creationDate;

    public String getCreationDate() {
        return creationDate;
    }

    public String getName() {
        return name;
    }
    Team(){}

    Team(String name, String creationDate){
        this.creationDate = creationDate;
        this.name = name;
    }
}
