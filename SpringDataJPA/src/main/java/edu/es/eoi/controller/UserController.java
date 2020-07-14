package edu.es.eoi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.User;
import edu.es.eoi.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("users/{id}")	
	public ResponseEntity<User> findUserByIdUsuario(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findUserById(id));
	}	
	
	@GetMapping("users")
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}	

}
