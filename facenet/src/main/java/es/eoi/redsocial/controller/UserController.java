package es.eoi.redsocial.controller;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
	public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody UserDto user) {
		User currentUser = userService.findById(id);
		if (currentUser == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		else {
			currentUser.setSurname(user.getSurname());
			
			userService.updateUserById(currentUser.getId(),currentUser.getSurname());
			return new ResponseEntity<User> (currentUser, HttpStatus.OK);
		}
	}
	// Login
	@Query(value = "SELECT * FROM users WHERE user LIKE =1  AND PASS =2")
	@RequestMapping(method = RequestMethod.POST,value = "user/login" )
    public String login(@RequestParam(value = "username") String userName,
            @RequestParam(value = "pass") String pass) {
    return userName;
	}
	
	// RelationShips
}
