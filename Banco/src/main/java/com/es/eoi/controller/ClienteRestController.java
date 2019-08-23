package com.es.eoi.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.eoi.dto.ClienteDto;
import com.es.eoi.entity.Cliente;
import com.es.eoi.service.ClienteService;

@RestController
public class ClienteRestController {

	@Autowired
	ClienteService service;

	@GetMapping("/cliente/{dni}")
	public Cliente findCliente(@PathVariable String dni) {
		return service.findByDni(dni);
	}

	@PostMapping("/cliente")
	public void updateCliente(@RequestBody ClienteDto cliente) {
		Cliente entity= new Cliente();
		BeanUtils.copyProperties(cliente, entity);
		service.save(entity);
	}

	@DeleteMapping("/cliente/{dni}")
	public void deleteCliente(@PathVariable String dni) {
		service.remove(dni);
	}

	@GetMapping("/cliente/all")
	public List<Cliente> findAll() {
		return service.findAll();
	}

}