package com.es.eoi.booking;

public class Airplane extends Transport {

	
	private String code;
	private int flight;
	private String model;
	private String brand;
	
	public Airplane() {				
		super.seatMap=new char[50][4];
	}

	@Override
	public double calculatePrice() {
		
		return 300;
	}

	@Override
	public String reserveRandomSeat() {
		
		char[] a = null;
		char[] b = null;
		
		for (int i = 0; i < seatMap.length; i++) {
			
			
			for (int j = 0; j < seatMap.length; j++) {
				
				if(seatMap[i][j]==' ') {
					
					a=seatMap[j];
				}
			}
				
			b=seatMap[i];
		}
		
		return a.toString()+b.toString();
	}

	@Override
	public String reserveSeat(char x, char y) {
				
		//TODO logica de reserva
		
		return "";
	}

	@Override
	public String cancelSeat(char x, char y) {
		
		super.getSeatMap();
		
		return "";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getFlight() {
		return flight;
	}

	public void setFlight(int flight) {
		this.flight = flight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Airplane [code=" + code + ", flight=" + flight + ", model=" + model + ", brand=" + brand + "]";
	}
	
	

}
