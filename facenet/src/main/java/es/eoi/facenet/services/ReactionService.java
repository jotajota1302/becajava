package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.User;

public interface ReactionService  {
	
	public List<Reaction> reactionList(int id);
	public boolean createReaction(String reactionType, User user, Message message);

}