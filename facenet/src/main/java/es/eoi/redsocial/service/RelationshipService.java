package es.eoi.redsocial.service;

import es.eoi.redsocial.entity.User;

public interface RelationshipService {

	public void createRelationsship(User us, User us2);
	public void deleteRelationship(int id);
	public void updateRelationshipToFriend(int id);
	
}
