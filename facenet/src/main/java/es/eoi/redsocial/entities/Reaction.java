package es.eoi.redsocial.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reactions")
@Setter
@Getter
public class Reaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "reactionType")
	private int reactionType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_users")
	private User userObject;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_messages")
	private Message messageObject;

	public Reaction() {
	}

	public Reaction(int id, int reactionType, User userObject, Message messageObject) {
		this.id = id;
		this.reactionType = reactionType;
		this.userObject = userObject;
		this.messageObject = messageObject;
	}
	
	
}
