package es.eoi.facenet.rest;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.dto.UserDto;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.UserService;
 
@RestController
public class UserRestController {
 
	@Autowired
	UserService service;
	
    @GetMapping("/user/{id}")
    public User findUser(@PathVariable String id) {   
    	return service.getUserById(Integer.parseInt(id));
    }
    
    @GetMapping("/user/all")
    public List<User> findAll() {   
    	return service.findAll();
    }
    
    @GetMapping("/user/search/{name}")
    public List<User> findByName(@PathVariable String name) {   
    	return service.findAllByName(name);
    }
    
    @PostMapping("/user")
    public User updateUser(@RequestBody UserDto userDto) {     	
    	User user = new User();    	
    	BeanUtils.copyProperties(userDto, user);    	
    	return service.updateUser(user);
    }
    
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id) {      	
    	 service.deleteUser(Integer.parseInt(id));
    }
}