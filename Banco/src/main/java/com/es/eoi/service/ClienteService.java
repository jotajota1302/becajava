package com.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.eoi.entity.Cliente;
import com.es.eoi.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	public void save(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public Cliente findByNif(String nif) {
		return clienteRepository.findById(nif).get();
	}

	public void remove(String nif) {
		clienteRepository.deleteById(nif);
	}
}
