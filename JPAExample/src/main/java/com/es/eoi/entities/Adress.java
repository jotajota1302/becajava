package com.es.eoi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "adress")
@Getter
@Setter
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idAdress;

	@Column
	private String adress;

	@OneToOne(cascade = CascadeType.ALL,optional = false)
	@PrimaryKeyJoinColumn
	private Person person;

	public Adress() {

	}

}
