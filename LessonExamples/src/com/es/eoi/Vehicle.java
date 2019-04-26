package com.es.eoi;

public class Vehicle {
	
	private int wheels;
	
	private String color;
	
	public void run() {
		System.out.println("este vehiculo se mueve");
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
}
