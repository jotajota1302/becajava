package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.Event;

public interface EventService {

	public Event findById(Integer id);

	public Event createEvent(Event event);

	public List<Event> findAll(); 
}
