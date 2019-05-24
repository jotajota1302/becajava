package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;

public interface EventService  {
	public List<Event> findAll();
}
