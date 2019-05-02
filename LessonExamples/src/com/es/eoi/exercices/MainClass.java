package com.es.eoi.exercices;

public class MainClass {

	public static void main(String[] args) {
		
		
//		Electrodomestico electrodomestico= new Electrodomestico();
//		electrodomestico= new Electrodomestico(80, "GRIS","A",10);
//		
//		System.out.println(electrodomestico);
//		System.out.println("precio final :" + electrodomestico.precioFinal());
		
		Electrodomestico ele1=new Lavadora(60);
		Electrodomestico ele2=new Lavadora(20);
		Electrodomestico ele3=new Lavadora(10);
		Electrodomestico ele4=new Lavadora(30);
		Electrodomestico ele5=new Lavadora(50);
		Electrodomestico ele6=new Television();
		Electrodomestico ele7=new Television();
		Electrodomestico ele8=new Television();
		Electrodomestico ele9=new Television();
		Electrodomestico ele10=new Television();
		
		
		Electrodomestico[] electrodomesticos= new Electrodomestico[10];
		
		electrodomesticos[0]=ele1;
		electrodomesticos[1]=ele2;
		electrodomesticos[2]=ele3;
		electrodomesticos[3]=ele4;
		electrodomesticos[4]=ele5;
		electrodomesticos[5]=ele6;
		electrodomesticos[6]=ele7;
		electrodomesticos[7]=ele8;
		electrodomesticos[8]=ele9;
		electrodomesticos[9]=ele10;
		
		double total=0;
		double totalTv=0;
		double totalLavadora=0;
	
		for (Electrodomestico electrodomestico2 : electrodomesticos) {
						
			if(electrodomestico2 instanceof Lavadora) {
				totalLavadora=totalLavadora+electrodomestico2.precioFinal();
			}
			if(electrodomestico2 instanceof Television) {
				totalTv=totalTv+electrodomestico2.precioFinal();
			}
			
			total=total+electrodomestico2.precioFinal();
		}
		
		System.out.println("precio final " + total);
		System.out.println("precio final lavadoras " + totalLavadora);
		System.out.println("precio final Tv " + totalTv); 
	}

}
