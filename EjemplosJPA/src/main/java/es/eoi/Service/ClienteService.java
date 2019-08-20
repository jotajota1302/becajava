package es.eoi.Service;

import java.util.List;
import es.eoi.Repository.ClienteRepository;
import es.eoi.entity.Cliente;

public class ClienteService {

	ClienteRepository clienteRepository;

	public ClienteService() {
		this.clienteRepository = new ClienteRepository();
	}

	public void createClient() {

		clienteRepository.createClient();
	}

	public List<Cliente> findAllClientes() {

		return clienteRepository.findAllClientes();
	}

	public Cliente findByDni(String dni) {
		return clienteRepository.findByDni(dni);
	}

	public void updateClient(String dni, String nombre, String direccion) {
		clienteRepository.updateClient(dni, nombre, direccion);
	}

	public void removeClient(String dni) {
		clienteRepository.removeClient(dni);
	}

}
