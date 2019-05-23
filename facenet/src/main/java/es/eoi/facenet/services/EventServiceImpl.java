package es.eoi.facenet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.repositories.EventRepository;



@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository repository;
	

}