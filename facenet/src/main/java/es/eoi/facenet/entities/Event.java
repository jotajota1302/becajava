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

@Entity
@Table(name = "Events")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "eventdate")
	private Date eventdate;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	private List<Assist> assists;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	private User user;

	public Event() {
	}

	public Event(int id, String name, String description, Date eventdate, List<Assist> assists, User user) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.eventdate = eventdate;
		this.assists = assists;
		this.user = user;
	}

	public Integer getId() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date geteventdate() {
		return eventdate;
	}

	public void setEventDate(Date eventdate) {
		this.eventdate = eventdate;
	}

	public List<Assist> getAssists() {
		return assists;
	}

	public void setAssists(List<Assist> assists) {
		this.assists = assists;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
