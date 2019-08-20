package com.es.eoi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAdress;
	
	@Column
	private String adress;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Person person;

}
