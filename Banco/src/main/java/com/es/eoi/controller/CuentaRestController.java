package com.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.eoi.entity.Cuenta;
import com.es.eoi.service.CuentaService;

@RestController
public class CuentaRestController {

	@Autowired
	CuentaService service;

	@GetMapping("/cuenta/{id}")
	public Cuenta findCuenta(@PathVariable String id) {
		return service.findById(Integer.parseInt(id));
	}

	@PostMapping("/cuenta")
	public void updateCuenta(@RequestBody Cuenta cuenta) {	
		service.save(cuenta);
	}

	@DeleteMapping("/cuenta/{id}")
	public void deleteCuenta(@PathVariable String id) {
		service.remove(Integer.parseInt(id));
	}

	@GetMapping("/cuenta/all")
	public List<Cuenta> findAll() {
		return service.findAll();
	}

}