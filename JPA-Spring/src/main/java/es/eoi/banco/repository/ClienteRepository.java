package es.eoi.banco.repository;

import es.eoi.banco.entity.Cliente;

public interface ClienteRepository {

	void createClient(Cliente cliente);	

	Cliente findByDni(String dni);

	void updateClient(String dni, String nombre, String direccion);

	void removeClient(String dni);

}