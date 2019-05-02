package com.es.eoi.booking;

import java.util.Arrays;
import java.util.Date;

public abstract class Transport {
	
	private int capacity;
	
	protected char[][] seatMap;
	
	private Date creationDate;
	
	private double price;
	
	public abstract double calculatePrice();
		
	public abstract String reserveRandomSeat();	
	
	public abstract String reserveSeat(char x, char y);

	public abstract String cancelSeat(char x, char y);

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public char[][] getSeatMap() {
		return seatMap;
	}

	public void setSeatMap(char[][] seatMap) {
		this.seatMap = seatMap;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Transport [capacity=" + capacity + ", seatMap=" + Arrays.toString(seatMap) + ", creationDate="
				+ creationDate + ", price=" + price + "]";
	}
	
	
	
}
