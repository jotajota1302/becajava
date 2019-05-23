package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.User;

public interface UserService  {


	public List<User> findAll();
	public User findById();
	
	

}