package es.eoi.redsocial.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import es.eoi.redsocial.entities.User;


@Service
public interface IUserService {
	public List<User> findAll();
	public void deleteById(int id);
	public User findById(int id);
	public User save(int id, String name, String surname, Date birthDate, Date startDate, String userName, String pass);
	public void updateUserById(int id, String surname);
//	public List<User> findByUserName(String name);
}
