package com.example.demo;

import com.example.demo.repos.TeamRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    private TeamRepos teamRepos;

    @GetMapping
    public Iterable<Team> find(){ return teamRepos.findAll();}

    @PostMapping
    public void create(@RequestBody Map<String, String> message){
        Team team = new Team(message.get("firstname"), message.get("creationDate"));
        teamRepos.save(team);
    }

    @DeleteMapping
    public void delete(@RequestBody Long id){
        teamRepos.deleteById(id);
    }
}
