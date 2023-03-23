package com.example.demo.repos;

import com.example.demo.Footballer;
import org.springframework.data.repository.CrudRepository;

public interface  FootballerRepos extends CrudRepository<Footballer, Long> {
}
