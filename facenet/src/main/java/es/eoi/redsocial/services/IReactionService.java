package es.eoi.redsocial.services;

 import java.util.List;

import org.springframework.stereotype.Service;

import es.eoi.redsocial.entities.Message;
import es.eoi.redsocial.entities.Reaction;
import es.eoi.redsocial.entities.User;

@Service
public interface IReactionService {
	public List<Reaction> findAll();
	public void deleteById(int id);
	public Reaction findById(int id);
	public Reaction save(int id, int reactionType, User userObject, Message messageObject);
}
