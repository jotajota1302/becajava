package es.eoi.redsocial.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepo;

	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public void deleteById(int id) {
		try {
			userRepo.deleteById(id);
			System.out.println("Borrado");
		} catch (Exception e) {
			System.out.println("No borrado");
		}

	}

	@Override
	public User findById(int id) {
		return userRepo.findById(id).get();
	}

	@Override
	public User save(int id, String name, String surname, Date birthDate, Date startDate, String userName,
			String pass) {
		User u = new User(id,name,surname,birthDate, startDate, userName, pass);
		return userRepo.save(u);
	}

	@Override
	public User updateUser(int id, String name, String surname, Date birthDate, Date startDate, String userName,
			String pass) {
		User u = new User(id, name,surname, birthDate, startDate, userName,
				pass);
		return userRepo.save(u); 
	}

}
