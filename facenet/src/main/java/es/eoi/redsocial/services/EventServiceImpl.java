package es.eoi.redsocial.services;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IEventRepository;

@Service
public class EventServiceImpl implements IEventService {

	@Autowired
	IEventRepository eventRepository;
	
	@Override
	public List<Event> findAll() {
		return eventRepository.findAll();
	}

	@Override
	public Event findById(int id) {
		return eventRepository.findById(id).get();
	}

	@Override
	public void deletebyId(int id) {
		try {
			eventRepository.deleteById(id);
			System.out.println("Borrado");
		} catch (Exception e) {
			System.out.println("No borrado");
		}
	}

	 @Override 
	 public Event save(String name, String description, Date eventdate,User userObject) { 
		 Event event=new Event(name, description, eventdate,userObject); 
		 return eventRepository.save(event); }

	
	 

}
