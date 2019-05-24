package es.eoi.facenet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_reaction")
	private int idReaction;
	
	@Column(name = "reactiontype")
	private String reactionType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_post")
	public Post post;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	public User user;
	
	
	public Reaction() {
		
	}


	public Reaction(int idReaction, String reactionType) {
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
