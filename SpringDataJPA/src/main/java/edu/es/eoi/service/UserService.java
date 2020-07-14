package edu.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public User findUserById(Integer id) {			
		return repository.findById(id).get();
	}
	
	public User saveUSer(User user) {			
		return repository.save(user);
	}
	
	public List<User> findAll() {			
		return repository.findAll();
	}
	
}
