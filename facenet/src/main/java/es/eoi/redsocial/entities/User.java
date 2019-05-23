package es.eoi.redsocial.entities;


import java.util.Date;
import java.util.List;

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
@Table(name = "users")
@Setter
@Getter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "birthdate")
	private Date birthDate;
	
	@Column(name = "startdate")
	private Date startDate;
	
	@Column(name = "user")
	private String userName;
	
	@Column(name = "pass")
	private String pass;
	
	@OneToMany(fetch = FetchType.LAZY)
	List<Message> messageList;
	@OneToMany(fetch = FetchType.LAZY)
	List<Reaction> reactionList;
	@OneToMany(fetch = FetchType.LAZY)
	List<Relationship> relationshipList;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
	List<Event> eventList;
	@OneToMany(fetch = FetchType.LAZY)
	List<Assistance> assistanceList;
	
	public User() {
		
	}
	
	public User(int id, String name, String surname, Date birthDate, Date startDate, String userName, String pass) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.userName = userName;
		this.pass = pass;
	}	
	
	public User(int id, String name, String surname, Date birthDate, Date startDate, String userName, String pass,
			List<Message> messageList, List<Reaction> reactionList, List<Relationship> relationshipList) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.userName = userName;
		this.pass = pass;
		this.messageList = messageList;
		this.reactionList = reactionList;
		this.relationshipList = relationshipList;
	}
	
}
