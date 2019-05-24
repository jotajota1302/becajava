package es.eoi.facenet.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.EventRepository;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository repositoryEvent;

	public List<Event> findAll() {
		return repositoryEvent.findAll();
	}
	
	@Override
	public Event findById(int id) {
		return repositoryEvent.findById(id).get();
	}

	@Override
	public boolean createEvent(String name, String description, Date eventDate, User user) {
		Event eventCreate = new Event(name, description, eventDate, user);
		if(repositoryEvent.saveAndFlush(eventCreate) != null) {
			return true;
		} else {
			return false;
		}
	}
	
	
}