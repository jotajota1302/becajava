package es.eoi.facenet.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;
<<<<<<< HEAD
=======
import es.eoi.facenet.repositories.AssistanceRepository;
>>>>>>> branch 'grupo1' of https://github.com/jotajota1302/becajava.git
import es.eoi.facenet.repositories.EventRepository;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
<<<<<<< HEAD
	private EventRepository repository;
	
	@Override
=======
	private EventRepository repositoryEvent;


>>>>>>> branch 'grupo1' of https://github.com/jotajota1302/becajava.git
	public List<Event> findAll() {
<<<<<<< HEAD
		return repository.findAll();
=======
		return repositoryEvent.findAll();
	
>>>>>>> branch 'grupo1' of https://github.com/jotajota1302/becajava.git
	}
	
	@Override
	public Event findById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public boolean createEvent(String name, String description, Date eventDate, User user) {
		Event eventCreate = new Event(name, description, eventDate, user);
		if(repository.saveAndFlush(eventCreate) != null) {
			return true;
		} else {
			return false;
		}
	}
	
	
}