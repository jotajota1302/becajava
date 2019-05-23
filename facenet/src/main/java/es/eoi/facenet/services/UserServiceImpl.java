package es.eoi.facenet.services;

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
	
	@Autowired
	private RelationshipRepository repositoryRelation;

	@Override
	public boolean deleteRelationship(int id) {

		return false;
	}


	

}