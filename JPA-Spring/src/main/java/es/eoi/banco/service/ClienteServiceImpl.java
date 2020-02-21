package es.eoi.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.banco.entity.Cliente;
import es.eoi.banco.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public void createClient(Cliente cliente) {
		clienteRepository.createClient(cliente);
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
