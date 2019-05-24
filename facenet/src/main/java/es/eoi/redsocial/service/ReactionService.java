package es.eoi.redsocial.service;

import es.eoi.redsocial.entity.Message;
import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.repository.ReactionRepository;

public interface ReactionService {

	public void createReaction(String reactionType, User us,Message mess);
	
	
}
