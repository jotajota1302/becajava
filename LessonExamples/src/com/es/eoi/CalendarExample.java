package com.es.eoi;

public class CalendarExample {

	public static void main(String[] args) {
		
		int param=Integer.parseInt(args[0]);
		
		String[] meses=new String[12];
		
		meses[0]="Enero";
		meses[1]="Febrero";
		meses[2]="Marzo";
		meses[3]="Abril";
		meses[4]="Mayo";
		meses[5]="Junio";
		meses[6]="Julio";
		meses[7]="Agosto";
		meses[8]="Septiembre";
		meses[9]="Octubre";
		meses[10]="Noviembre";
		meses[11]="Diciembre";

		System.out.println("Has elegido el mes: " + args[0]);
			
		String temporal="";
		
		if(param>=12||param<1) {
			System.out.println("numero no permitido");		
		}
		else {
			for (int i = param; i < meses.length; i++) {
				
				temporal=temporal.concat(meses[i-1]);
				
				if(i!=11) {
					temporal=temporal.concat(",");
				}
			}
			
			System.out.println(temporal);
		}
	
	}

}
