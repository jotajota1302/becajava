package es.eoi.facenet.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="NAME")
	private String name;
	
	@Column(name ="SURNAME")	
	private String surname;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDATE")
	private Date birthdate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "STARDATE")
	private Date stardate;
	
	@Column(name ="USER")
	private String user;
	
	@Column(name ="PASS")
	private String pass;
	
	@OneToMany(mappedBy = "user1")
	private List<Relationship> relationships1;
	
	@OneToMany(mappedBy = "user2")
	private List<Relationship> relationships2;
	
	@OneToMany(mappedBy = "user")
	private List<Reaction> reactions;
	
	@OneToMany(mappedBy = "user")
	private List<Assistance> assistances;
	
	@OneToMany(mappedBy = "user")
	private List<Message> messages;
	
	@OneToMany(mappedBy = "user")
	private List<Event> events;

	public User(String name, String surname, Date birthdate, Date stardate, String user, String pass,
			List<Relationship> relationships1, List<Relationship> relationships2, List<Reaction> reactions,
			List<Assistance> assistances, List<Message> messages, List<Event> events) {
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.stardate = stardate;
		this.user = user;
		this.pass = pass;
		this.relationships1 = relationships1;
		this.relationships2 = relationships2;
		this.reactions = reactions;
		this.assistances = assistances;
		this.messages = messages;
		this.events = events;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Date getStardate() {
		return stardate;
	}
	public void setStardate(Date stardate) {
		this.stardate = stardate;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public List<Relationship> getRelationships1() {
		return relationships1;
	}
	public void setRelationships1(List<Relationship> relationships1) {
		this.relationships1 = relationships1;
	}
	public List<Relationship> getRelationships2() {
		return relationships2;
	}
	public void setRelationships2(List<Relationship> relationships2) {
		this.relationships2 = relationships2;
	}
	public List<Reaction> getReactions() {
		return reactions;
	}
	public void setReactions(List<Reaction> reactions) {
		this.reactions = reactions;
	}
	public List<Assistance> getAssistances() {
		return assistances;
	}
	public void setAssistances(List<Assistance> assistances) {
		this.assistances = assistances;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
}
