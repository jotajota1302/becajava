package com.es.eoi;

import java.util.Scanner;

public class LotteryExample {
	
	static String[] prizes= new String[7];
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) {			
			 prizes[i]=(int)(Math.abs(Math.random()*99999))+"";			
		}
		
		System.out.println("Introduce numero:");
		
		Scanner escaner= new Scanner(System.in);
		
		String number= escaner.next();
		
		escaner.close();
		
		System.out.println("Introduce el dia de la semana (1-7):");
		
		escaner= new Scanner(System.in);
		
		int day=escaner.nextInt();
		
		//logica de comprobacion del premio
		
		if(day>0&&day<8&&prizes[day].equals(number)){
			
			System.out.println("eres rico");
						
		}
		else {
			System.out.println("error en los datos de entrada");
		}
		
	}
	
	

}
