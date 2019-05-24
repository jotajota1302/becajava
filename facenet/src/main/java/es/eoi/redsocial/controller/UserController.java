package es.eoi.redsocial.controller;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.redsocial.dto.UserDto;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.services.IUserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private IUserService userService;

	// FindAll
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDto>> findAll() {
		ModelMapper model = new ModelMapper();
		List<UserDto> userDto;
		List<User> user = userService.findAll();
		java.lang.reflect.Type targetListType = new TypeToken<List<UserDto>>() {
		}.getType();
		userDto = model.map(user, targetListType);
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}

	// FindById
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<UserDto> findById(@PathVariable int id) {
		ModelMapper model = new ModelMapper();
		UserDto userDto;
		User user = userService.findById(id);
		java.lang.reflect.Type targetType = new TypeToken<UserDto>() {
		}.getType();
		userDto = model.map(user, targetType);
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}

	// FullUserFindById
//	@RequestMapping(method = RequestMethod.GET, value = "fullUser/{id}")
//	public ResponseEntity<UserDto> fullFindById(@PathVariable int id){
//    	ModelMapper model = new ModelMapper();
//    	UserDto userDto;
//    	User user = userService.findById(id);
//    	java.lang.reflect.Type targetType = new TypeToken<UserDto>() {
//    	}.getType();
//    	userDto = model.map(user, targetType);
//    	return new ResponseEntity<>(userDto, HttpStatus.OK);
//	}

	// Add New User
	@RequestMapping(method = RequestMethod.POST)
	public User saveUser(@RequestBody UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		User u = userService.save(userDto.getId(),userDto.getName(), userDto.getSurname(),userDto.getBirthDate(),userDto.getStartDate(),
				userDto.getUser(),userDto.getPassword());
		return u;
	}
	// Update User
//	@RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
//	public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user,
//			@PathVariable String name,@PathVariable String surname,@PathVariable Date birthDate,
//			@PathVariable Date startDate, @PathVariable String userName, @PathVariable String password) {
//		User currentUser = userService.findById(id);
//		if (currentUser == null) {
//			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//		}
//		else {
//			currentUser.setName(name);
//			currentUser.setSurname(surname);
//			currentUser.setBirthDate(birthDate);
//			currentUser.setStartDate(startDate);
//			currentUser.setUserName(userName);
//			currentUser.setPass(password);
//			
//			userService.updateUser(currentUser.getId(),currentUser.getName(),currentUser.getSurname(),currentUser.getBirthDate(),
//					currentUser.getStartDate(),currentUser.getUserName(), currentUser.getPass());
//			return new ResponseEntity<User> (currentUser, HttpStatus.OK);
//		}
//		
//	}
	@RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
	private Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
	    return repository.findById(id)
	      .map(employee -> {
	        employee.setName(newEmployee.getName());
	        employee.setRole(newEmployee.getRole());
	        return repository.save(employee);
	      })
	      .orElseGet(() -> {
	        newEmployee.setId(id);
	        return repository.save(newEmployee);
	      });
	  }

}
