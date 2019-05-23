package es.eoi.redsocial.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.entities.Message;
import es.eoi.redsocial.entities.Reaction;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IReactionRepository;

@Service
public class ReactionServiceImpl implements IReactionService {

	@Autowired
	private IReactionRepository reactionRepo;

	@Override
	public List<Reaction> findAll() {
		return reactionRepo.findAll();
	}

	@Override
	public void deleteById(int id) {
		try {
			reactionRepo.deleteById(id);
			System.out.println("Borrado");
		} catch (Exception e) {
			System.out.println("No borrado");
		}

	}

	@Override
	public Reaction findById(int id) {
		return reactionRepo.findById(id).get();

	}

	@Override
	public Reaction save(int id, int reactionType, User userObject, Message messageObject) {
		Reaction r = new Reaction(id, reactionType, userObject, messageObject);
		return reactionRepo.save(r);
	}

}
