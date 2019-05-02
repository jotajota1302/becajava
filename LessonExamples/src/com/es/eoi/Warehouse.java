package com.es.eoi;

import java.util.Arrays;

public class Warehouse {
	
	String[] products= new String[20];	
	
	public Warehouse() {
		
		for (int i = 0; i < products.length; i++) {
			products[i]="product"+i;
		}
	}

	@Override
	public String toString() {
		return "Warehouse [products=" + Arrays.toString(products) + "]";
	}

	
	
}
