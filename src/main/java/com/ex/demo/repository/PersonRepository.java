package com.ex.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.demo.data.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {}