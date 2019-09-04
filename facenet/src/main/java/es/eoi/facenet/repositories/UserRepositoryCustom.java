package es.eoi.facenet.repositories;

import java.util.List;

import es.eoi.facenet.entities.User;

public interface UserRepositoryCustom {	
	
	List<User> findByName(String name);
}
