package es.eoi.facenet.services;

import java.util.List;
import es.eoi.facenet.entities.Assist;


public interface AssistService {

	public Assist save(Assist assist);
	
	public Assist findById(int id);
	
	public void deleteById(int id);
	
	public boolean existsById(int id);
	
	public List<Assist> findAll();
}
