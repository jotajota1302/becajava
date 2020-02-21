package es.eoi.banco.service;

import es.eoi.banco.entity.Cliente;

public interface ClienteService {

	void createClient(Cliente cliente);

	Cliente findByDni(String dni);

	void updateClient(String dni, String nombre, String direccion);

	void removeClient(String dni);

}