package com.es.eoi.dto;

import javax.persistence.Column;

public class CuentaDto {

	private int id;

	@Column(name = "SALDO")
	private double saldo;
	
	private ClienteDto cliente;

	private BancoDto banco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public BancoDto getBanco() {
		return banco;
	}

	public void setBanco(BancoDto banco) {
		this.banco = banco;
	}
	
	

}
