package es.eoi.redsocial.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import es.eoi.redsocial.entities.Relationship;
import es.eoi.redsocial.entities.User;

@Service
public interface IRelationshipService {

	public List<Relationship> findAll();
	public void deleteById(int id);
	public Relationship findById(int id);
	public Relationship save(User userReceive, User userSend, int state);
	public List<Relationship> findRelationship(int id);
}
