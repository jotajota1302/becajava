package com.es.eoi.exercices;

public class Lavadora extends Electrodomestico {


	private double carga;

	public Lavadora(double carga) {		
		super();
		this.carga = carga;		
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public double precioFinal() {
		
		double precio=super.precioFinal();	
		
		if(carga>30) {
			precio=precio+50;
		}
		return precio;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
	

	
	
}
