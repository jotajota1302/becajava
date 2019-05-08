package com.es.eoi;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private List<Car> car= new ArrayList<Car>();

	public List<Car> getCar() {
		return car;
	}

	public Client(String color,int ruedas,String name) {
		this.car= new ArrayList<Car>();
		Car coche= new Car();
		coche.setColor(color);
		coche.setWheels(ruedas);
		this.car.add(coche);		
	}
	
	public void setCar(List<Car> car) {
		this.car = car;
	}

	public void insertCar(Car car) {
		this.car.add(car);
	}
	
	

}
