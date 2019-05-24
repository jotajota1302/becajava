package es.eoi.redsocial.entities;

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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "messages")
@Setter
@Getter
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "publishdate")
	private Date publishDate;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "messageObject")
	private List<Reaction> reactionList;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iduser")
	private User userObject;
	
	public Message() {
		
	}
	
	
	public Message(int id, String content, Date publisDate, List<Reaction> reactionList, User userObject) {
		this.id = id;
		this.content = content;
		this.publishDate = publisDate;
		this.reactionList = reactionList;
		this.userObject = userObject;
	}


	public Message(int id, String content, Date publisDate, User userObject) {
		this.id = id;
		this.content = content;
		this.publishDate = publisDate;
		this.userObject = userObject;
	}
}
