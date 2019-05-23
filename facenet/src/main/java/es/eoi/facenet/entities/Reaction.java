package es.eoi.facenet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REACTIONS")
public class Reaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "REACTIONTYPE")
	private String reactiontype;
	
	@ManyToOne
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "id_message", referencedColumnName = "id")
	private Message message;

	public Reaction( String reactiontype, User user, Message message) {
		this.reactiontype = reactiontype;
		this.user = user;
		this.message = message;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReactiontype() {
		return reactiontype;
	}
	public void setReactiontype(String reactiontype) {
		this.reactiontype = reactiontype;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
}
