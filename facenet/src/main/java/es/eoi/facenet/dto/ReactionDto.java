package es.eoi.facenet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reactions")
public class ReactionDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reaction")
	private int idReaction;
	
	@Column(name = "reactiontype")
	private String reactionType;

	public ReactionDto() {
		super();
	}

	public ReactionDto(int idReaction, String reactionType) {
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
