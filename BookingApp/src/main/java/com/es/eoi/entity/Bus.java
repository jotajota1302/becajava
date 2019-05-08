package com.es.eoi.entity;

import com.es.eoi.Cancelable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bus extends Transport implements Cancelable {

	private String code;

	private int floors;

	private boolean wc;

	@Override
	public void cancel() {
		// TODO falta la logica de cancelar
		
	}

	

}
