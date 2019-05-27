package es.eoi.facenet.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;
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

	//Test okey
	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public List<User> allusers(){
		return service.findAll();
	}
	
	//Test okey
	@RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
	public User user (@PathVariable int id ) 
			 {
		return service.findById(id);
	}
	
	//Test okey
	@RequestMapping(method = RequestMethod.POST, value = "/users",params = {"name", "surname", "birthdate", "username", "pass"} )
	public User newUser(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "surname") String surName,
			@RequestParam(value = "birthdate") Date birthDate,
			@RequestParam(value = "username") String userName,
			@RequestParam(value = "pass") String pass
			) {
		User user = new User();
		Date date = new Date();
		
		user.setName(name);
		user.setSurName(surName);
		user.setBirthDate(birthDate);
		user.setUserName(userName);
		user.setPass(pass);
		user.setStartDate(date);
		
		return service.save(user);
	}
	
	//Test okey
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}", params = {"surname"})
	public User updateUser(
			
			@PathVariable int id,
			@RequestParam(value = "surname") String surname
			
			) {
		
			User user = service.findById(id);
			
			user.setSurName(surname);
			
			return service.save(user);
		}
	 	
	@RequestMapping(method = RequestMethod.POST, value = "/login", params = {"username", "pass" })
	@Query(value = "SELECT * FROM USERS WHERE USERNAME LIKE =?1  AND PASS =2")
	public String login(
	
			@RequestParam(value = "username") String userName,
			@RequestParam(value = "pass") String pass
			
			) {
	return userName;
	}
}
