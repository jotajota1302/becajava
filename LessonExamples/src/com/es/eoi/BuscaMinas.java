package com.es.eoi;

public class BuscaMinas {
	
	public static void main(String [] args) {
		
		int[][] tablero = createTablet(10,10);
		
		putBombs(tablero);		
		
		paintTablet(tablero);
				
		
	}

	private static int[][] createTablet(int height,int width) {
						
		int[][] tablero=new int[height][width];	
				
		return tablero;
	}

	private static void putBombs(int[][] tablero) {
		
		tablero[2][8]=1;
		tablero[1][6]=1;
		tablero[5][2]=1;
		
	}

	private static void paintTablet(int[][] tablero) {
		
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
