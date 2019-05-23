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
	
	@Column(name = "birthDate")
	private Date birthDate;
	
	@Column(name = "startDate")
	private Date startDate;
	
	@Column(name = "user")
	private String userName;
	
	@Column(name = "pass")
	private String pass;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	List<Message> messageList;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	List<Reaction> reactionList;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	List<Relationsship> relationshipList;
	
	public User() {
		
	}
	
	public User(int id, String name, String surname, Date birthDate, Date startDate, String userName, String pass,
			List<Message> messageList, List<Reaction> reactionList, List<User> userList) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.userName = userName;
		this.pass = pass;
		this.messageList = messageList;
		this.reactionList = reactionList;
		this.userList = userList;
	}
}
