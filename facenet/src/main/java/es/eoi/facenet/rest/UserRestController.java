package es.eoi.facenet.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.UserService;
 
@RestController
public class UserRestController {
 
	@Autowired
	UserService service;
	
    @GetMapping("/user/{id}")
    public User message(@PathVariable String id) {   
    	return service.getUserById(Integer.parseInt(id));
    }
}