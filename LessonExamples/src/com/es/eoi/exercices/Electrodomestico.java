package com.es.eoi.exercices;

public class Electrodomestico {
	
	final static String DEFAULT_COLOR="BLANCO";
	final static String DEFAULT_CONSUMO="F";
	final static double DEFAULT_PRECIO=100;
	final static double DEFAULT_PESO=5;
	
	
	private double precioBase;
	
	private String color;
	
	private String consumoEnergetico;

	private double peso;

	public Electrodomestico() {
		this.color=DEFAULT_COLOR;
		this.precioBase=DEFAULT_PRECIO;
		this.consumoEnergetico=DEFAULT_CONSUMO;
		this.peso=DEFAULT_PESO;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color=DEFAULT_COLOR;
		this.consumoEnergetico=DEFAULT_CONSUMO;
	}

	public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		
		if(comprobarColor(color)) {
			this.color = color;
		}else {
			this.color=DEFAULT_COLOR;
		}		
		if(comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}else {
			this.consumoEnergetico=DEFAULT_CONSUMO;
		}		
		this.peso = peso;
	}

	public double precioFinal() {
		
		Double precio=0.0;
		
		switch (this.consumoEnergetico.toUpperCase()) {
		case "A":
			precio=100.0;
			break;
		case "B":
			precio=80.0;
			break;
		case "C":
			precio=60.0;
			break;
		case "D":
			precio=50.0;
			break;
		case "E":
			precio=30.0;
			break;			
		default:
			precio=10.0;
			break;
		}
		
		if(peso>=80) {
			precio=precio+100;
		}
		else if(peso<80&&peso>=50) {
			precio=precio+80;
		}
		else if(peso<50&&peso>=20) {
			precio=precio+50;
		}
		else if(peso<20&&peso>=0) {
			precio=precio+10;
		}
				
		return precio+precioBase;
	}
	
	private boolean comprobarConsumoEnergetico(String letra) {
		
		String tmp="abcdef".toUpperCase();
		
		if(tmp.contains(letra)){
			return true;
		}
		else {
			return false;
		}				
	}
	
	private boolean comprobarColor(String letra) {
		
		String tmp="blanconegroazulgris".toUpperCase();
		
		if(tmp.contains(letra)){
			return true;
		}
		else {
			return false;
		}				
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
	
	

}
