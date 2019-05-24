package es.eoi.facenet.services;

import java.util.Date;
import java.util.List;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;

public interface EventService  {
	public List<Event> findAll();
	public Event findById(int id);
	public boolean createEvent(String name, String description, Date eventDate, User user);
}
