package com.sql.server;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sql.server.model.Person;

import net.bytebuddy.utility.RandomString;

@SpringBootTest
public class GeneratePerson {
	
	@Test
	public void withDocumentNull() {
		Person person = new Person();
		person.setName("Jack Hanefford");
		person.setAge(23);		
		assertEquals(null, person.getDocument());
	}
	
	@Test
	public void withNameLessThan5() {
		Person person = new Person();
		person.setName("Jack");
		person.setAge(23);
		person.setDocument("123456789");
		assertEquals(4, person.getName().length());
	}
	
	public Person generatePerson() {
		Person person = new Person();
		person.setName("Jack hanefford");
		person.setAge(23);
		person.setDocument("123456789");
		return person;
	}
	
	
	RandomString randon = new RandomString(30);
	Random age = new Random();
	
	public Person generatorPersonRandon() {			
		Person person = new Person();
		person.setName(randon.nextString());
		person.setAge(age.nextInt(98));
		person.setDocument(randon.nextString());
		return person;
	}
}
