package com.es.eoi.exercices;

public class Television extends Electrodomestico {
	
	private double resolucion;

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + "]";
	}
	
	

}
