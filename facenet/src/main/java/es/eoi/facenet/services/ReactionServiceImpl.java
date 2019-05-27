package es.eoi.facenet.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.repositories.ReactionRepository;

@Service
public class ReactionServiceImpl implements ReactionService {

	@Autowired
	ReactionRepository repository;

	@Override
	public Reaction save(Reaction reaction) {
		return repository.save(reaction);
	}

	@Override
	public Reaction findById(int id) {
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
	public List<Reaction> findAll() {
		return repository.findAll();
	}
	
	
	
}
