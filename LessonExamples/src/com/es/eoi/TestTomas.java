package com.es.eoi;

import java.util.Scanner;

public class TestTomas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String texto = "";
		String opcion;
		double resultado = 0;
		System.out.println(
				"Bienvenido. ¿De qué figura quieres calcular su área? (Escribe circulo, triangulo o cuadrado.");
		opcion = sc.nextLine();
		switch (opcion) {
		case "circulo":
			System.out.println("Introduce el radio del circulo");
			double radio = Double.parseDouble(texto);
			resultado = areaCirculo(radio);
			break;
		case "triangulo":
			System.out.println("Introduce la base del triangulo");
			double base = Double.parseDouble(texto);
			System.out.println("Introduce la altura del triangulo");
			double altura = Double.parseDouble(texto);
			resultado = areaTriangulo(base, altura);
			break;
		case "cuadrado":
			System.out.println("Introduce la longitud del lado del cuadrado");
			double lado = Double.parseDouble(texto);
			resultado = areaCuadrado(lado);
			break;
		default:
			System.out.println("No has introducido una figura correcta");
		}
		System.out.println("El area del " + opcion + " es " + resultado);

	}

	public static double areaCirculo(double radio) {

		return Math.pow(radio, 2) * Math.PI;
	}

	public static double areaTriangulo(double base, double altura) {

		return base * altura / 2;
	}

	public static double areaCuadrado(double lado) {

		return lado * lado;
	}
}
