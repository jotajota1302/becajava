package com.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "CUENTAS")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true)
	private int id;

	@Column(name = "SALDO")
	private double saldo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dni", referencedColumnName = "DNI")
	private Cliente cliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDBANCO", referencedColumnName = "ID")
	private Banco banco;

}
