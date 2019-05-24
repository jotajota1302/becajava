package es.eoi.redsocial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.entities.Relationship;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IRelationshipRepository;

@Service
public class RelationshipServiceImpl implements IRelationshipService{

	@Autowired
	IRelationshipRepository relationRepository;
	
	@Override
	public List<Relationship> findAll() {
		return relationRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		try {
			relationRepository.deleteById(id);
			System.out.println("Borrado");
		} catch (Exception e) {
			System.out.println("No borrado");
		}
	}

	@Override
	public Relationship findById(int id) {
		return relationRepository.findById(id).get();
	}

	@Override
	public Relationship save(User receiveUser, User sendUser, int state) {
		Relationship relation=new Relationship (receiveUser, sendUser,state);
		return relationRepository.save(relation);
	}

}
