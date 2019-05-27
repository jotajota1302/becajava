package es.eoi.facenet.services;

import es.eoi.facenet.entities.User;

public interface RelationshipService  {

	public boolean deleteRelationship(int id);
	public boolean updateRelationship(int id);
	public boolean createRelationship(String name, User user1, User user2);

}