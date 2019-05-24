package es.eoi.redsocial.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.eoi.redsocial.entity.Event;
import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService{
	@Autowired
	EventRepository ev;
	

	

	@Override
	public List<Event> findAll() {
		
		return ev.findAll();
	}

	@Override
	public Event findById(int id) {
		Event event = new Event();
		event = ev.findById(id).get();
		
		return event;
	}

	@Override
	public void createEvent(String name, String description, Date eventDate) {
		Event event = new Event();
		event.setNombre(name);
		event.setDescripcion(description);
		event.setFechaEvento(eventDate);
		
	}

	

	

	@Override
	public void yesAssistanceEvent(User us, int idEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noAssistanceEvent(User us, int idEvent) {
		// TODO Auto-generated method stub
		
	}

	

}
