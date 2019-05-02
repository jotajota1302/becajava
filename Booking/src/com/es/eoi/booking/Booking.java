package com.es.eoi.booking;

import java.util.Arrays;

public class Booking {

	
	private Trip[] trips;
	
	private Client client;
	
	public double calculatePrice() {
		
		double temp=0;
		
		for (Trip trip : trips) {
			
			temp=temp+trip.calculatePrice();
		}
		
		return temp;
	}

	public Trip[] getTrips() {
		return trips;
	}

	public void setTrips(Trip[] trips) {
		this.trips = trips;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Booking [trips=" + Arrays.toString(trips) + ", client=" + client + "]";
	}
	
	
}

