package com.es.eoi.booking;

public class Destiny {
	
	 private String country;
	 private String city;
	 private String destiny;
	 private String observations;
	 private double price;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDestiny() {
		return destiny;
	}
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Destiny [country=" + country + ", city=" + city + ", destiny=" + destiny + ", observations="
				+ observations + ", price=" + price + "]";
	}
	 
	 
}
