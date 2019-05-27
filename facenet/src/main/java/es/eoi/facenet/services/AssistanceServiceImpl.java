package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.AssistanceRepository;

@Service
public class AssistanceServiceImpl implements AssistanceService {

	@Autowired
	private AssistanceRepository repository;

	@Override
	public List<User> findByUsersYesAssistance(int id_event) {
		return repository.findByUsersYesAssistance(id_event);
	}

	@Override
	public List<User> findByUsersNotAssistance(int id_event) {
		return repository.findByUsersNotAssistance(id_event);
	}

	@Override
	public List<Event> findByEventYesAssistance(int id_user) {
		return repository.findByEventYesAssistance(id_user);
	}

	@Override
	public List<Event> findByEventNotAssistance(int id_user) {
		return repository.findByEventNotAssistance(id_user);
	}

	@Override
	public boolean notassist(Event event, User user) {
		Assistance assistance = new Assistance("YES", event, user);
		if(repository.saveAndFlush(assistance) != null) {
			return true;
		} else {
			return false;
			}
	}

	@Override
	public boolean yesassist(Event event, User user) {
		Assistance assistance = new Assistance("NO", event, user);
		if(repository.saveAndFlush(assistance) != null) {
			return true;
		} else {
			return false;
			}
	}
}