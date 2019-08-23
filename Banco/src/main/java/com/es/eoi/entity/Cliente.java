package com.es.eoi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "CLIENTES")
public class Cliente {
	@Id
	@Column(name = "DNI", unique = true)
	private String dni;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "DIRECCION")
	private String direccion;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Cuenta> cuentas;

}
