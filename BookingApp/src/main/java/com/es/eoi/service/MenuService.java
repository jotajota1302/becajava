package com.es.eoi.service;

import java.util.Scanner;

@SuppressWarnings("resource")
public class MenuService {

	
	public static void printMainMenu() {

		System.out.println("Bienvenido al Booking flipante, seleccione una opcion: ");
		System.out.println("1-Reservar viaje ");
		System.out.println("2-Consultar reservas ");
		System.out.println("3-Consultar clientes ");
		System.out.println("4-Consultar viajes ");
		

		Scanner scaner = new Scanner(System.in);
		int option = scaner.nextInt();

		switch (option) {
		case 1:
			BookingService.createBooking();
			break;
		case 2:
			BookingService.findBookings();
			break;
		case 3:
			ClientService.findClients();
			break;
		case 4:
			TripService.findTrips();
			break;
		default:
			break;
		}
		
		printMainMenu();
	}

	
	public static void printDestinyMenu() {
		
		System.out.println("Intruduzca los datos del destino: ");
	
		//TODO seguir con esta logica
		
	}
}
