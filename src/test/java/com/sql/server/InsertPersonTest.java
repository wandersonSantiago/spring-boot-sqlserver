package com.sql.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sql.server.model.Person;
import com.sql.server.repository.PersonRepository;

@SpringBootTest
public class InsertPersonTest {

	@Autowired
	private PersonRepository repository;

	@Test
	public void insert() {
		Person person = new  GeneratePerson().generatePerson();
		repository.save(person);
	}
	
	//@Test
	public void insert100000People() {
		for(int i = 0; i < 99999; i ++ ) {
			Person person = new  GeneratePerson().generatorPersonRandon();
			repository.save(person);
		}
	}

}
