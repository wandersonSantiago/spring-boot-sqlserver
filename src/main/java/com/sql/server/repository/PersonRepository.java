package com.sql.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sql.server.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
