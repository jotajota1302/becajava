package es.eoi.redsocial.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.redsocial.entity.Event;

public interface EventService  {
	
		public List<Event> findAll();
		public Event findById(int id);
		public void createEvent(String name, String description, Date eventDate);
		public void yesAssistanceEvent(int idUser, int idEvent);
		public void noAssistanceEvent(int idUser, int idEvent);
		
}
