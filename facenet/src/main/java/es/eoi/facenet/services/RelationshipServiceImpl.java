package es.eoi.facenet.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.eoi.facenet.entities.Relationship;
import es.eoi.facenet.repositories.RelationshipRepository;

@Service
public class RelationshipServiceImpl implements RelationshipService{

	@Autowired
	private RelationshipRepository repository;

	@Override
	public Relationship save(Relationship relationship) {
		return repository.save(relationship);
	}

	@Override
	public Relationship findById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}

	@Override
	public boolean existsById(int id) {
		return repository.existsById(id);
	}

	@Override
	public List<Relationship> findAll() {
		return repository.findAll();
	}

}
