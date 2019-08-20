package com.es.eoi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "person")
@Getter
@Setter
public class Person {
	
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idPerson;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	private Adress adress;

	public Person(int idPerson, String name, String surname, Adress adress) {
		super();
		this.idPerson = idPerson;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
	}
	
	public Person() {	
	
	}

}
