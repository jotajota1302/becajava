package es.eoi.facenet.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Relationship;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.RelationshipRepository;
import es.eoi.facenet.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repositoryUser;

	@Override
	public List<User> findAll() {
		return repositoryUser.findAll();
	}

	@Override
	public User findById(int id) {
		return repositoryUser.findById(id).get();
	}

	@Override
	public User findByIdAll(int id) {
		return repositoryUser.findById(id).get();
	}

	@Override
	public boolean createUser(String name, String surname, Date birthdate, Date stardate, String user, String pass) {
		User userCreate = new User(name, surname, birthdate, stardate, user, pass);
		if(repositoryUser.saveAndFlush(userCreate)!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean updateSurname(int id, String surname) {
		User user = repositoryUser.findById(id).get();
		user.setSurname(surname);
		if(repositoryUser.saveAndFlush(user)!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public User login(String user, String pass) {
		return repositoryUser.login(user, pass);
	}

}