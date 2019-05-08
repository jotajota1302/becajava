package com.es.eoi;

public class BookingException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void printStackTrace() {
		
		System.out.println("ha ocurrido un error fatal WTF!");
	}

	@Override
	public String getMessage() {
		
		return "Eres un puto manazas";
	}
	
	

}
