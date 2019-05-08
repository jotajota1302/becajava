package com.es.eoi.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trip {

	private Transport transport;

	private Destiny fromDestiny;

	private Destiny toDestiny;

	private Date departure;

	private Date arrival;

	public double calculatePrice() {
		
		//TODO calcular el precio del  viaje, aqui seguramente llamare a TripService
		
		return 0;
	}
	
}
