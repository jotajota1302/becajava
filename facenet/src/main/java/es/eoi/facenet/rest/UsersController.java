package es.eoi.facenet.rest;

import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.UserService;

@Configuration
@RestController
public class UsersController {

	@Autowired
	UserService service;

	
	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public List<User> allusers(){
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/users/{id}", params = {"id"})
	public User user(
			@PathParam(value = "id" ) int id
			) {
		return service.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users",params = {"name", "surname", "birthdate", "username", "pass"} )
	public User newUser(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "surname") String surName,
			@RequestParam(value = "birthdate") Date birthDate,
			@RequestParam(value = "username") String userName,
			@RequestParam(value = "pass") String pass
			) {
		User user = new User();
		
		user.setName(name);
		user.setSurName(surName);
		user.setBirthDate(birthDate);
		user.setUserName(userName);
		user.setPass(pass);
		
		return service.save(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}", params = {"surname"})
	public boolean updateUser(
			@PathParam(value = "id") int id,
			@RequestParam(value = "surname") String surName
			) {
		
		if(service.existsById(id) == true) {
			
			User user = new User();
			
			user.setSurName(surName);
			
			 service.save(user);
			
			 return true;
		}
		 return false;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/login", params = {"username", "pass" })
	public User login(
			@RequestParam(value = "username") String userName,
			@RequestParam(value = "pass") String pass
			@Query(value = "SELECT * FROM USERS WHERE USERNAME LIKE = ? AND PASS = ?")
			
			
			) {
	return null;
}
