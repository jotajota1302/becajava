package es.eoi.facenet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public boolean deleteRelationship(int id) {

		repository.deleteById(id);
		User user = repository.findById(id).get();
		
		if(user!=null) {
			return false;
		}else {
			return true;
		}

	}
	
	public boolean updateRelationship(int id) {
		
		repository.(id);
		
		
	}
	

}