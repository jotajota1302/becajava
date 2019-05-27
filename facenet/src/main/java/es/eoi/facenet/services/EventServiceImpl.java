package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Assist;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.EventRepository;

@Service
public class EventServiceImpl implements EventService{

	@Autowired
	EventRepository repository;

	public List<Event> findAll() {
		return repository.findAll();
	}

	public Event findById(int id) {
		return repository.findById(id).get();
	}

	public Event save(Event event) {
		return repository.save(event);
	}

	@Override
	public Event createEvent(Event event) {
		return repository.save(event);
	}

	@Override
	public boolean yesAssistance(int id_user) {
		return true;
	}

	@Override
	public boolean notAssistance(int id_user) {
		return false;
	}

	@Override
	public List<Assist> findYesAssistance(int id_user) {
		return null;
	}

	@Override
	public List<Assist> findNotAssistance(int id_user) {
		return null;
	}

	@Override
	public List<User> findNotAssistUser(int id_user) {
		return null;
	}

	@Override
	public List<User> notAssistEventsUser(int id_user) {
		return null;
	}

}
