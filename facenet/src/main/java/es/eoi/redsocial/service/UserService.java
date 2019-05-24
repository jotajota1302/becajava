package es.eoi.redsocial.service;

import java.util.Date;
import java.util.List;

import es.eoi.redsocial.entity.User;

public interface UserService {
	
	public List<User> findAll();
	public User findById(int id);
	public User findByIdFullInfo(int id);
	public void createUser(String name, String surname, Date birthdate, String user,String pass);
	public void updateSurnameById(int id, String surname);
	public User login (String username , String pass);
	
}
