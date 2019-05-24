package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.repositories.EventRepository;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository repository;
	
	public List<Event> findAll(){
		return repository.findAll();
	}
	
	public Event findById(Integer id) {
		return repository.findById(id).get();
	}
	
	public Event save(Event event) {
		return repository.save(event);
	}

	@Override
	public Event createEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}
}
