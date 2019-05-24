package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.Relationship;

public interface RelationshipService {

	public Relationship save(Relationship relationship);
	
	public Relationship findById(int id);
	
	public void deleteById(int id);
	
	public boolean existsById(int id);
	
	public List<Relationship> findAll();
}
