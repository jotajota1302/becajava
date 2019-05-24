package es.eoi.redsocial.service;

import java.util.Date;
import java.util.List;
import es.eoi.redsocial.entity.Event;
import es.eoi.redsocial.entity.User;

public interface EventService  {
	
		public List<Event> findAll();
		public Event findById(int id);
		public void createEvent(String name, String description, Date eventDate);
		public void yesAssistanceEvent(User us, int idEvent);
		public void noAssistanceEvent(User us, int idEvent);
		
}
