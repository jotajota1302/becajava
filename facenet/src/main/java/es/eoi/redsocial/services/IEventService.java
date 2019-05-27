package es.eoi.redsocial.services;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.dto.UserDto;
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.entities.User;

@Service
public interface IEventService {
	public List<Event> findAll();
	public Event findById(int id);
	public void deletebyId(int id);
	public Event save(String name, String description, Date eventdate, User userObject);
	public List<Event> findEventsFromUsers(int iduser);

}
