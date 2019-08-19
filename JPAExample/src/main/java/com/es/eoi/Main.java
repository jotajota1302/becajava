package com.es.eoi;

import com.es.eoi.entities.Person;
import com.es.eoi.repositories.PersonRepository;

public class Main {

	public static void main(String[] args) {
		
		PersonRepository repository= new PersonRepository();
		
		Person person= new Person();
		person.setName("JOSE JUAN");		
		
		repository.create(person);
		
		System.out.println("-----------------");
		
	}

}
