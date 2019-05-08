package com.es.eoi.exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExamples {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();

		lista.add("Jose Juan");
		lista.add("Iago");
		lista.add("Lander");
		lista.add("Mario");
		lista.add("Tomas");
		lista.add("Angel");	
		lista.add("Jose Juan");		
		
		for (String string : lista) {
			System.out.println(string);
		}
				
		Set<String> set=new HashSet<String>();
		
		set.add("Jose Juan");
		set.add("Iago");
		set.add("Lander");
		set.add("Mario");
		set.add("Tomas");
		set.add("Angel");	
		set.add("Jose Juan");
		
		Map<String,String> mapa= new HashMap<String, String>();
		
		mapa.put("Jose Juan", "656543434");
		
		String clave = (String) mapa.get("Jose Juan");
		
		mapa.get(clave);
		
		List<String> list= new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		
		ArrayList<String> list2= new ArrayList<String>(list);
//		ArrayList<String> list2= new ArrayList<String>();
//		list2.add("Green");
//		list2.add("White");
//		
//		Collections.copy(list, list2);
		
		
	}

}

