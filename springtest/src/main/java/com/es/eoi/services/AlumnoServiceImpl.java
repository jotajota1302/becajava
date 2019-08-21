package com.es.eoi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.eoi.repositories.AlumnoRepository;

@Service(value = "AlumnoService")
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	AlumnoRepository repository;

	@Override
	public String findName(int id) {
		return this.repository.findName(id);
	}

}
