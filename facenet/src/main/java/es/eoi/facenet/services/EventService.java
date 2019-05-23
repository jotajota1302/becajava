package es.eoi.facenet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.repositories.EventRepository;

@Service
public class EventService {

	@Autowired
	EventRepository repository;

	public Event getMessageById(Integer id) {
		return this.repository.findById(id).get();
	}

	public Event updateEvent(Event event) {
		return this.repository.save(event);
	}

	public void deleteEvent(Event event) {
		this.repository.delete(event);
	}

}
