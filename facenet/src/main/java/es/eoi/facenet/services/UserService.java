package es.eoi.facenet.services;

import java.util.List;


import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.User;

@Service
public interface UserService {

	public List<User> findAll();
	public User findById(int id);
	public User save(User user);
	public boolean existsById(int id);
	
}
