package com.example.demo.repos;

import com.example.demo.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepos extends CrudRepository<Team, Long> {
}
