package com.es.eoi;

import java.util.List;

import com.es.eoi.entity.Booking;
import com.es.eoi.entity.Client;
import com.es.eoi.entity.Trip;
import com.es.eoi.service.MenuService;

public class MainApp {	
	
	public static List<Booking> bookings;
	public static List<Client> clients;
	public static List<Trip> trips;	


	public static void main(String[] args) {

			MenuService.printMainMenu();

	}

}
