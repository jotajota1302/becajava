package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;

import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public User getUserById(Integer id) {
		return this.repository.findById(id).get();
	}

	public User updateUser(User user) {
		return this.repository.save(user);
	}

	public void deleteUser(Integer id) {
		this.repository.deleteById(id);
	}

	public List<User> findAll() {		
		return (List<User>) repository.findAll();
	}

	public List<User> findByName(String name) {
		
		return repository.findByName(name);
	}
	
	
	
	public List<User> findAllByName(String name) {

		ExampleMatcher matcher = ExampleMatcher.
				matchingAny().
				withMatcher("status",	ExampleMatcher.GenericPropertyMatchers.startsWith()).
				withMatcher("pepito",	ExampleMatcher.GenericPropertyMatchers.contains());

		User user = new User();
		user.setName(name);
		Example<User> userExample = Example.of(user, matcher);

		return repository.findAll(userExample);
	}
	
	public List<User> findByPredicate(Predicate predicate) {

		return (List<User>) repository.findAll(predicate);
	}

}
