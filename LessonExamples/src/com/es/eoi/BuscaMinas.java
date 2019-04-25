package com.es.eoi;

public class BuscaMinas {
	
	public static void main(String [] args) {
		
		int altura=10;
		int anchura=10;
		
		int[][] tablero=new int[altura][anchura];	
		
		tablero[2][8]=1;
		tablero[1][6]=1;
		tablero[5][2]=1;
		
		String tmp="";
		
		for (int i = 0; i < tablero.length; i++) {			
			
			int[] js = tablero[i];
			
			for (int j = 0; j < js.length; j++) {
				tmp = tmp + js[j] + "|";
			}
			tmp= tmp+"\n";							
		}
		
		
		System.out.println(tmp);
				
		
	}

}
