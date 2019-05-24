package es.eoi.redsocial.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.repository.UserRepository;

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
		User userr = new User();
		userr.setNombre(name);
		userr.setApellido(surname);
		userr.setFechaNacimiento(birthdate);
		userr.setUsuario(user);
		userr.setPass(pass);
		//Aqui iria la fecha de alta
		userRepository.save(userr);
		
		
	}

	@Override
	public void updateSurnameById(int id, String surname) {
		User user = new User();
		user = userRepository.findById(id).get();
		user.setApellido(surname);
		userRepository.save(user);
		
		
	}

	@Override
	public User login(String username, String pass) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
