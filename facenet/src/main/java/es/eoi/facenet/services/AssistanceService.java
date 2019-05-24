package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;

public interface AssistanceService  {
	public List<User> findByUsersYesAssistance();
	public List<User> findByUsersNotAssistance();
	public List<Event> findByEventYesAssistance();
	public List<Event> findByEventNotAssistance();
	
	public boolean notassist(Event event, User user);
	public boolean yesassist(Event event, User user);
}
