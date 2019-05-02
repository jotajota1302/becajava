  package com.es.eoi.booking;

import java.util.Date;

public class Trip {
	
	private Transport transport;
	
	private Destiny fromDestiny;
	
	private Destiny toDestiny;
	
	private Date departure;
	
	private Date arrival;
	
	
	public double calculatePrice() {
		//TODO implement calculate logic 
		return 0.0;
	}


	public Transport getTransport() {
		return transport;
	}


	public void setTransport(Transport transport) {
		this.transport = transport;
	}


	public Destiny getFromDestiny() {
		return fromDestiny;
	}


	public void setFromDestiny(Destiny fromDestiny) {
		this.fromDestiny = fromDestiny;
	}


	public Destiny getToDestiny() {
		return toDestiny;
	}


	public void setToDestiny(Destiny toDestiny) {
		this.toDestiny = toDestiny;
	}


	public Date getDeparture() {
		return departure;
	}


	public void setDeparture(Date departure) {
		this.departure = departure;
	}


	public Date getArrival() {
		return arrival;
	}


	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}


	@Override
	public String toString() {
		return "Trip [transport=" + transport + ", fromDestiny=" + fromDestiny + ", toDestiny=" + toDestiny
				+ ", departure=" + departure + ", arrival=" + arrival + "]";
	}

	
	
}
