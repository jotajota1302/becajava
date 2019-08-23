package com.es.eoi.dto;

import javax.persistence.Column;

import com.es.eoi.entity.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentaDto {

	private int id;

	@Column(name = "SALDO")
	private double saldo;
	
	private Cliente cliente;

	private BancoDto banco;

}
