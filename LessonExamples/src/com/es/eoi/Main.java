package com.es.eoi;

public class Main {

	public static void main(String[] args) {

		Cube cubo = new Cube();

		//esta line es nueva
		
		cubo.height = Double.parseDouble(args[0]);
		cubo.large =  Double.parseDouble(args[1]);;
		

		System.out.println("volumen: " + cubo.getVolume());

	}

}
