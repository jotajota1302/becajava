package es.eoi.facenet.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "MESSAGES")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "PUBLISHDATE")
	private Date publishdate;
	
	@ManyToOne
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;
	
	@OneToMany(mappedBy = "reaction")
	private List<Reaction> reactions;

	public Message(String content, Date publishdate, User user, List<Reaction> reactions) {
		this.content = content;
		this.publishdate = publishdate;
		this.user = user;
		this.reactions = reactions;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Reaction> getReactions() {
		return reactions;
	}
	public void setReactions(List<Reaction> reactions) {
		this.reactions = reactions;
	}
}
