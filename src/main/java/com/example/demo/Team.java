package com.example.demo;

import jakarta.persistence.*;

import javax.script.ScriptEngine;

@Entity
@Table(name="team")
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
    @OneToMany
    public Footballer footballer;
    Team(String name, String creationDate){
        this.creationDate = creationDate;
        this.name = name;
    }
}
