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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	
		
}
