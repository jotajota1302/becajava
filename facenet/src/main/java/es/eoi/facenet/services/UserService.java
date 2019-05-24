package es.eoi.facenet.services;

import java.util.Date;
import java.util.List;

import es.eoi.facenet.entities.User;

public interface UserService  {


	public List<User> findAll();
	public User findById(int id);
	public User findByIdAll(int id);
	public boolean createUser(String name, String surname, Date birthdate, Date stardate, String user, String pass);
	public boolean updateSurname(int id, String surname);
	public User login(String user,String pass);
	
	

}