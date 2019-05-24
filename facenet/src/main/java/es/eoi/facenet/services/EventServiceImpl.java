package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.AssistanceRepository;
import es.eoi.facenet.repositories.EventRepository;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository repositoryEvent;


	public List<Event> findAll() {
		return repositoryEvent.findAll();
	
	}
}