package com.es.eoi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.es.eoi.controller.AlumnoController;

public class Main {

	public static void main(String[] args) {
		
		
		//tengo que instar un contexto de spring
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);		
		
		AlumnoController controler = context.getBean("AlumnoController",AlumnoController.class);
				
		System.out.println("hola" + controler.findName(1));

	}

}
