package com.es.eoi.service;

import com.es.eoi.MainApp;
import com.es.eoi.entity.Client;

public class ClientService {
	
	
	public static void findClients() {
		
		//TODO logica de encontrar clientes
	}
	
	public static void addClient(Client client) {
		
		MainApp.clients.add(client);
		
	}

}
