package es.eoi.redsocial.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "reacciones")
public class Reaction {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "reactiontype")
	private String reactionType;

	private User user;

	private Message message;

	public Reaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reaction(int id, String reactionType, User user, Message message) {
		super();
		this.id = id;
		this.reactionType = reactionType;
		this.user = user;
		this.message = message;
	}
}
