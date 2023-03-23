package com.example.demo;

import com.example.demo.repos.FootballerRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/footballers")
public class FootballerController {

    @Autowired
    private FootballerRepos footballerRepos;



    Footballer footballer1 = new Footballer("David", "Everdeen");
    Footballer footballer2 = new Footballer("Donald", "Stone");
    Footballer footballer3 = new Footballer("Mark", "Watson");



    @GetMapping
    public Iterable<Footballer> find(){
        return footballerRepos.findAll();
    }

    @PostMapping
    public void create(@RequestBody Map<String, String> message){
        Footballer footballer = new Footballer(message.get("firstname"), message.get("lastname"));
        footballerRepos.save(footballer);
    }

    @DeleteMapping
    public void delete(@RequestBody Long id){
        footballerRepos.deleteById(id);
    }
}
