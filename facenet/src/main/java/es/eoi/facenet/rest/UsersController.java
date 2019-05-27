package es.eoi.facenet.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.entities.Relationship;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.RelationshipService;
import es.eoi.facenet.services.UserService;

@Configuration
@RestController
public class UsersController {
	
	
	@Autowired
	UserService service;
	@Autowired
	RelationshipService Rservice;

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
	
	//Test no okey
	@RequestMapping(method = RequestMethod.POST, value = "/login", params = {"username", "pass" })
	public User login(
	
			@RequestParam(value = "username") String userName,
			@RequestParam(value = "pass") String pass
			) {
				
				return service.findAllActiveUsers(userName, pass);
	}
	
	//Test okey
	@RequestMapping(method = RequestMethod.POST, value = "user/{id}/inviteFriend", params = {"state", "id_user1", "id_user2"})
	public Relationship newInvite(
			
			@PathVariable int id,
			@RequestParam(value = "state") String state,
			//El que invita
			@RequestParam(value = "id_user1") int id_user1,
			//A quien va la invitacion
			@RequestParam(value = "id_user2") int id_user2
			
			) {
		
		Relationship relationship =  new Relationship();
		
		relationship.setState(state);
		relationship.setUser1(service.findById(id_user1));
		relationship.setUser2(service.findById(id_user2));
		
		
		return Rservice.save(relationship);
	}
	
//	@RequestMapping(method = RequestMethod.GET, value = "user/{id}/pendingRelationship")
//	@Query("SELECT * FROM RELATIONSHIPS WHERE ID_USER1 LIKE = ?1")
//	public List<Relationship> listPending(
//			@PathVariable int id
//			
//			) {
//		
//		Relationship relationship = new Relationship();
//		
//		relationship.getUser1();
//		
//		
//		return Rservice.findById(relationship);
//	}
	
}
