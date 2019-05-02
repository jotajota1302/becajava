package com.es.eoi;

public class Product {

	public static void main(String[] args) {
		
		Main.almacen.products[6]="pepito";
		
		System.out.println("product: " + Main.almacen.products[6]);
			
		
		Warehouse almacen= new Warehouse();
				
				System.out.println("product: " + almacen.products[6]);

	}

}
