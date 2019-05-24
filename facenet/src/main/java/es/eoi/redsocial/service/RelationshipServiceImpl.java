package es.eoi.redsocial.service;

import org.springframework.beans.factory.annotation.Autowired;

import es.eoi.redsocial.entity.Relationship;
import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.repository.RelationshipRepository;
import es.eoi.redsocial.repository.UserRepository;

public class RelationshipServiceImpl implements RelationshipService {
	
	@Autowired
	UserRepository ur;
	@Autowired
	RelationshipRepository rsr;
	
	@Override
	public void createRelationsship(User us, User us2) {
		Relationship relation = new Relationship();
		
		User user1 = new User();
		User user2 = new User();
		String state = "PENDING";
		user1 = us;
		user2 = us2;
		relation.setEstado(state);
		relation.setUser1(user1);
		relation.setUser2(user2);
		
		rsr.save(relation);
		
	}

	@Override
	public void deleteRelationship(int id) {
		Relationship relation = new Relationship();
		relation = rsr.findById(id).get();
		rsr.delete(relation);
		
	}

	@Override
	public void updateRelationshipToFriend(int id) {
		Relationship relation = new Relationship();
		String state = "FRIEND";
		
		relation = rsr.findById(id).get();
		relation.setEstado(state);
		rsr.save(relation);
		
	}

}
