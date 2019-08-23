package com.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.eoi.entity.Cuenta;
import com.es.eoi.repository.CuentaRepository;

@Service
public class CuentaService {

	@Autowired
	CuentaRepository cuentaRepository;

	public void save(Cuenta cuenta) {
		cuentaRepository.save(cuenta);
	}

	public List<Cuenta> findAll() {
		return cuentaRepository.findAll();
	}

	public Cuenta findById(int id) {
		return cuentaRepository.findById(id).get();
	}

	public void remove(int id) {
		cuentaRepository.deleteById(id);
		;
	}
}
