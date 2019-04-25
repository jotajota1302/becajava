package com.es.eoi;

public class BuscaMinas {
	
	public static void main(String [] args) {
		
		int[][] tablero = createTablet(10,10);
		
		String tmp="";
		
		paintTablet(tablero, tmp);
				
		
	}

	private static int[][] createTablet(int height,int width) {
						
		int[][] tablero=new int[height][width];	
		
		tablero[2][8]=1;
		tablero[1][6]=1;
		tablero[5][2]=1;
		
		return tablero;
	}

	private static void paintTablet(int[][] tablero, String tmp) {
		
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
