package es.eoi.redsocial.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name = "publishDate")
	private Date publisDate;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "message")
	User userObject;

	public Message(int id, String content, Date publisDate, User userObject) {
		this.id = id;
		this.content = content;
		this.publisDate = publisDate;
		this.userObject = userObject;
	}
}
