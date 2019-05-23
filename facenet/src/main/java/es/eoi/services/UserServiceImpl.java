package es.eoi.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.eoi.redsocial.entity.User;
import es.eoi.repositories.UserRepository;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		List<User> userList = new ArrayList<User>();
		userList = userRepository.findAll();
		return userList;
	}

	@Override
	public User findById(int id) {
		User user = new User();
		user = userRepository.findById(id).get();
		
		return user;
	}

	@Override
	public User findByIdFullInfo(int id) {
		User user = new User();
		user = userRepository.findById(id).get();
		return user;
	}

	@Override
	public void createUser(String name, String surname, Date birthdate, String user, String pass) {
		
		
		
	}

	@Override
	public void updateSurnameById(int id, String surname) {
		User user = new User();
		user = userRepository.findById(id).get();
		
		
	}

	@Override
	public User login(String username, String pass) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
;
	
	
}
