package com.es.eoi.booking;

import java.util.Date;

public class Client {
	
	private String dni;
	
	private String name;
	
	private String surname;
	
	private Date birthDate;
	
	private Booking[] bookings;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Booking[] getBookings() {
		return bookings;
	}

	public void setBookings(Booking[] bookings) {
		this.bookings = bookings;
	}
	
	

}
