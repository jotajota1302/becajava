package edu.es.eoi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.User;
import edu.es.eoi.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("users/{id}")
	@ResponseBody
	public ResponseEntity<User> findUserByIdUsuario(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findUserById(id));
	}	

}
