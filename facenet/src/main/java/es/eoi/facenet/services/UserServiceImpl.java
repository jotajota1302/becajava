package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repository.existsById(id);
	}
	
	
	
}
