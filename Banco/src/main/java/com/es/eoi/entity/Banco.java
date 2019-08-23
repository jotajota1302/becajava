package com.es.eoi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "BANCO")
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "CIUDAD")
	private String ciudad;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "banco")
	private List<Cuenta> cuentas;

		
}
