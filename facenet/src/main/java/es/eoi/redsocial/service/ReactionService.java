package es.eoi.redsocial.service;

import java.util.List;

import es.eoi.redsocial.entity.Reaction;

public interface ReactionService {
	
	public List<Reaction> findAllReactionById(int id);
	
	public void createReactionByUser(int idUsuario, String typeReation);
	
}
