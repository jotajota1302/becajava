package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;

public interface AssistanceService {
	public List<User> findByUsersYesAssistance(int id_event);

	public List<User> findByUsersNotAssistance(int id_event);

	public List<Event> findByEventYesAssistance(int id_user);

	public List<Event> findByEventNotAssistance(int id_user);

	public boolean notassist(Event event, User user);

	public boolean yesassist(Event event, User user);
}
