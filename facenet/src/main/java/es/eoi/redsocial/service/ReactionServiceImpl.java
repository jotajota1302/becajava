package es.eoi.redsocial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.entity.Message;
import es.eoi.redsocial.entity.Reaction;
import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.repository.ReactionRepository;


@Service
public class ReactionServiceImpl implements ReactionService {
	@Autowired
	ReactionRepository rr;
	
	@Override
	public void createReaction(String reactionType, User us, Message mess) {
		
		Reaction reaction = new Reaction();
		Message post = new Message();
		User user = new User();
		
		String like = "LIKE";
		String love = "LOVE";
		String hate = "HATE";
		
			
			user = us;
			post = mess;
		
		if(like.equalsIgnoreCase(reactionType)) {
			
			reaction.setMessage(post);
			reaction.setReactionType(like);
			reaction.setUser(user);
			rr.save(reaction);
			System.out.println("Te gusta esta publicación");
			
		}else if(love.equalsIgnoreCase(reactionType)) {
			
			reaction.setMessage(post);
			reaction.setReactionType(love);
			reaction.setUser(user);
			rr.save(reaction);
			System.out.println("Te ha encantado la publicación");
			
		}else if(hate.equalsIgnoreCase(reactionType)) {
			
			reaction.setMessage(post);
			reaction.setReactionType(hate);
			reaction.setUser(user);
			rr.save(reaction);
			System.out.println("Odias esta publicación, menundo hater.");
			
		}else {
			System.out.println("Lo siento, las reacciones disponibles son: LIKE, LOVE o HATE");
		}
		
	}

}
