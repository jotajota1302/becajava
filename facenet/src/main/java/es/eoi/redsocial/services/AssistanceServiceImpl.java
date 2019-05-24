package es.eoi.redsocial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.eoi.redsocial.entities.Assistance;
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IAssistanceRepository;

public class AssistanceServiceImpl implements IAssistanceService{

	@Autowired
	IAssistanceRepository assistRepository;
	
	@Override
	public List<Assistance> findAll() {
		return assistRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		try {
			assistRepository.deleteById(id);
			System.out.println("Borrado");
		} catch (Exception e) {
			System.out.println("No borrado");
		}
	}

	@Override
	public Assistance findById(int id) {
		return assistRepository.findById(id).get();
	}

	@Override
	public Assistance save(User userObject, Event eventObject, int state) {
		Assistance assist =new Assistance(userObject, eventObject,state);
		return assistRepository.save(assist);
	}

}
