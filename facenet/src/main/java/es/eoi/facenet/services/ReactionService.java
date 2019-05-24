package es.eoi.facenet.services;

import java.util.List;
import es.eoi.facenet.entities.Reaction;

public interface ReactionService{

public Reaction save(Reaction reaction);
	
	public Reaction findById(int id);
	
	public void deleteById(int id);
	
	public boolean existsById(int id);
	
	public List<Reaction> findAll();
}
