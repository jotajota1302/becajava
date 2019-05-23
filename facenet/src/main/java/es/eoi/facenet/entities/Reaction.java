package es.eoi.facenet.entities;

import javax.persistence.Entity;

@Entity
public class Reaction {

	private int idReaction;
	
	private String reactionType;
	
	
	public Reaction() {
		
	}


	public Reaction(int idReaction, String reactionType) {
		super();
		this.idReaction = idReaction;
		this.reactionType = reactionType;
	}


	public int getIdReaction() {
		return idReaction;
	}


	public void setIdReaction(int idReaction) {
		this.idReaction = idReaction;
	}


	public String getReactionType() {
		return reactionType;
	}


	public void setReactionType(String reactionType) {
		this.reactionType = reactionType;
	}
	
	
}
