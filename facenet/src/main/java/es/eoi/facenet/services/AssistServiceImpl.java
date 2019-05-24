package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.eoi.facenet.entities.Assist;
import es.eoi.facenet.repositories.AssistRepository;

@Service
public class AssistServiceImpl implements AssistService{

	@Autowired
	private AssistRepository repository;
	
	@Override
	public Assist save(Assist assist) {
		return repository.save(assist);
	}

	@Override
	public Assist findById(int id) {
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
	public List<Assist> findAll() {
		return repository.findAll();
	}

}
