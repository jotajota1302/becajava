package es.eoi.redsocial.services;

import java.util.List;
import org.springframework.stereotype.Service;
import es.eoi.redsocial.dto.EventDto;
import es.eoi.redsocial.dto.UserDto;
import es.eoi.redsocial.entities.Assistance;
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.entities.User;


@Service
public interface IAssistanceService {

	public List<Assistance> findAll();
	public void deleteById(int id);
	public Assistance findById(int id);
	public Assistance save(User userObject, Event eventObject, int state);
	public Assistance findUsersFromEvent(int idevent);
	}
