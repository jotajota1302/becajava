package com.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.es.eoi.services.AlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired
	AlumnoService service;
	
	public String findName(int id) {
		return this.service.findName(id);
	}

}
