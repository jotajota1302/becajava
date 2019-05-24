package es.eoi.redsocial.service;

import es.eoi.redsocial.entity.Message;
import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.repository.ReactionRepository;

import java.util.List;

import es.eoi.redsocial.entity.Reaction;

public interface ReactionService {
	
	public List<Reaction> findAllReactionById(int id);
	
	public void createReactionByUser(int idUsuario, String typeReation);
	
	public void createReaction(String reactionType, User us,Message mess);
	
	
}
