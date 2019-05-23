package es.eoi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.dto.EntityRepository;
import es.eoi.redsocial.entity.TestEntity;

@Service
public class EntityService {
	
	@Autowired
	EntityRepository repository;
	
	public TestEntity getEntityById(Integer id) {				
		return this.repository.findById(id).get();		
	}

}
