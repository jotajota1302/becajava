package es.eoi.facenet.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import es.eoi.facenet.repositories.RelationshipRepository;

@Service
public class RelationshipServiceImpl implements RelationshipService {

	@Autowired
	private RelationshipRepository repository;
	

}