package es.eoi.facenet.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Relationship;
import es.eoi.facenet.repositories.RelationshipRepository;

@Service
public class RelationshipServiceImpl implements RelationshipService {

	@Autowired
	private RelationshipRepository repositoryRelation;
	

	@Override
	public boolean deleteRelationship(int id) {
	
		repositoryRelation.deleteById(id);
		Relationship relacion = repositoryRelation.findById(id).get();
		
		if(relacion!=null) {
			return false;
		}else {
			return true;
		}

	}
	
	public boolean updateRelationship(int id) {
		
		Relationship relacion = repositoryRelation.findById(id).get();
		
		relacion.setName("FRIEND");
		
		if(repositoryRelation.saveAndFlush(relacion)!=null) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
	
}