package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.ReactionRepository;

@Service
public class ReactionServiceImpl implements ReactionService {

	@Autowired
	private ReactionRepository repositoryReaction;

	@Override
	public List<Reaction> reactionList(int id) {
		return repositoryReaction.reactionList(id);
	}

	@Override
	public boolean createReaction(String reactiontype, User user, Message message) {

		Reaction reac = new Reaction(reactiontype, user, message);
		if (repositoryReaction.saveAndFlush(reac) != null) {
			return true;
		} else {
			return false;
		}

	}

}