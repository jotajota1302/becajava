package es.eoi.redsocial.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public User findByIdFullInfo(int id) {
		return userRepository.findById(id);
	}

	@Override
	public void createUser(String name, String surname, Date birthdate, String user, String pass) {
		User userr = new User();
		Date date = new Date();
		userr.setNombre(name);
		userr.setApellido(surname);
		userr.setFechaNacimiento(birthdate);
		userr.setUsuario(user);
		userr.setPass(pass);
		Date date = null;
		userr.setFechaAlta(date);
		userRepository.save(userr);
	}

	@Override
	public void updateSurnameById(int id, String surname) {
		User user = new User();
		user = userRepository.findById(id);
		user.setApellido(surname);
		userRepository.save(user);
	}

	@Override
	public User login(String username, String pass) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
