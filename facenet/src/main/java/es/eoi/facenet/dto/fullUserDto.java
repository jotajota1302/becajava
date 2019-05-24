package es.eoi.facenet.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.Relationship;

public class fullUserDto {

	private int id;

	private String name;

	private String surname;

	private Date birthdate;

	private Date stardate;

	private String user;

	private String pass;

	private List<RelationshipDto> relationships1;

	private List<RelationshipDto> relationships2;

	private List<ReactionDto> reactions;

	private List<AssistanceDto> assistances;

	private List<MessageDto> messages;

	private List<EventDto> events;

	public fullUserDto(int id, String name, String surname, Date birthdate, Date stardate, String user, String pass,
			List<RelationshipDto> relationships1, List<RelationshipDto> relationships2, List<ReactionDto> reactions,
			List<AssistanceDto> assistances, List<MessageDto> messages, List<EventDto> events) {
		this.id = id;
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

	public List<RelationshipDto> getRelationships1() {
		return relationships1;
	}

	public void setRelationships1(List<RelationshipDto> relationships1) {
		this.relationships1 = relationships1;
	}

	public List<RelationshipDto> getRelationships2() {
		return relationships2;
	}

	public void setRelationships2(List<RelationshipDto> relationships2) {
		this.relationships2 = relationships2;
	}

	public List<ReactionDto> getReactions() {
		return reactions;
	}

	public void setReactions(List<ReactionDto> reactions) {
		this.reactions = reactions;
	}

	public List<AssistanceDto> getAssistances() {
		return assistances;
	}

	public void setAssistances(List<AssistanceDto> assistances) {
		this.assistances = assistances;
	}

	public List<MessageDto> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageDto> messages) {
		this.messages = messages;
	}

	public List<EventDto> getEvents() {
		return events;
	}

	public void setEvents(List<EventDto> events) {
		this.events = events;
	}

}
