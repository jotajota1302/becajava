package es.eoi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.TestEntity;
import es.eoi.facenet.repositories.EntityRepository;

@Service
public class EntityService {
	
	@Autowired
	EntityRepository repository;
	
	public TestEntity getEntityById(Integer id) {				
		return this.repository.findById(id).get();		
	}

}
