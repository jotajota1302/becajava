package com.es.eoi;

import java.util.Scanner;

public class BombSearch {
	
	public static void main(String [] args) {
		
		int[][] tablet = createTablet(10,10);
		
		int bombs=insertData();
		
		putBombs(tablet,bombs);		
		
		paintTablet(tablet);		
	
	}

	private static int[][] createTablet(int height,int width) {
						
		int[][] tablet=new int[height][width];	
				
		return tablet;
	}

	private static void putBombs(int[][] tablet, int bombsNumber) {
		
		for (int i = 0; i < bombsNumber; i++) {
			
			int xBomb = (int)Math.abs(Math.random()*10);
			int yBomb=  (int)Math.abs(Math.random()*10);
			
			tablet[xBomb][yBomb]=1;
		}
			
	}

	private static void paintTablet(int[][] tablet) {
		
		String tmp="";
		
		for (int i = 0; i < tablet.length; i++) {	
			int[] js = tablet[i];			
			for (int j = 0; j < js.length; j++) {
				tmp = tmp + js[j] + "|";
			}
			tmp= tmp+"\n";							
		}	
		System.out.println(tmp);
	}

	private static int insertData() {
		
		System.out.println("Introduce el numero de bombas");
		
		Scanner scanner= new Scanner(System.in);
		
		scanner.close();
		
		return scanner.nextInt();
				
	}
}
