package es.eoi.redsocial.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.redsocial.dto.UserDto;
import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.service.UserService;

@RestController
public class UsersController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user/{id}")
	public User findUser(@PathVariable String id) {
		return service.findById(Integer.parseInt(id));
	}
	
	@GetMapping("/user/{id}")
	public User findByIdFullInfo(@PathVariable String id) {
		return service.findByIdFullInfo(Integer.parseInt(id));
	}
	
	@GetMapping("/user/all")
	public List<User> findAll() {
		return service.findAll();
	}

	@PostMapping("/user")
	public void updateUser(@RequestBody UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		service.updateSurnameById(user.getId(), user.getApellido());
	}
	
	
	

//	@DeleteMapping("/user/{id}")
//	public void deleteUser(@PathVariable String id) {
//		service.deleteUser(Integer.parseInt(id));
//	}



//	@GetMapping("/user/search/{name}")
//	public List<User> findByName(@PathVariable String name) {
//		return service.findAllByName(name);
//	}

}
