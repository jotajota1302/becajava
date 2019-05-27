package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.Assist;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;

public interface EventService {

	public Event findById(int id);

	public Event createEvent(Event event);

	public List<Event> findAll(); 
	
	public boolean yesAssistance(int id_user);
	
	public boolean notAssistance(int id_user);
	
	public List<Assist> findYesAssistance(int id_user);
	
	public List<Assist> findNotAssistance(int id_user);
	
	public List<User> findNotAssistUser(int id_user);
	
	public List<User> notAssistEventsUser(int id_user);
}
