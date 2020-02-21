package es.eoi.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.eoi.banco.service.ClienteService;

@Controller
@RequestMapping
public class ClienteController {

	@Autowired
	ClienteService service;	
	
	@GetMapping("/client")
	public void findClientByID() {
		
		System.out.println(service.findByDni("03765983S"));
	}
	
}
