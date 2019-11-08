package com.sql.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
	@SequenceGenerator(name = "sequence_generator", sequenceName = "person_sequence")
	private Long id;	
	@Size(max = 50, min = 5, message = "not compatible size")
	private String name;
	@NotBlank(message = "not white document")
	private String document;
	@NotNull(message = "not null document")
	private Integer age;
	
}
