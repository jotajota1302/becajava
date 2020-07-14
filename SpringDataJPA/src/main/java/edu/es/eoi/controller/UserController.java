package edu.es.eoi.controller;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@PostMapping("users")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		user.setFecha(Calendar.getInstance().getTime());
		service.saveUSer(user);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PutMapping("users/{id}")
	@ResponseBody
	public ResponseEntity<String> updateUser(@PathVariable Integer id, @RequestBody User user) {

		if (user.getSaldo() == null) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}

		if (!id.equals(user.getId())) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		} else {
			service.saveUSer(user);
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
	}

	@DeleteMapping("users/{id}")
	@ResponseBody
	public ResponseEntity<String> deleteByIdUsuario(@PathVariable Integer id) {
		service.deleteUserById(id);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}}
