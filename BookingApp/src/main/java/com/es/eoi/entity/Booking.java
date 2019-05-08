package com.es.eoi.entity;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booking {

	
	private Set<Trip> trips;
	
	private Client client;	
		
	public double calculatePrice(){
		
		double temp=0;
		
		for (Trip trip : trips) {
			
			temp=temp+trip.calculatePrice();
		}
		
		return temp;
	}

	


	
}

