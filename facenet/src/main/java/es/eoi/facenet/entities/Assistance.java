package es.eoi.facenet.entities;

import javax.persistence.*;

@Entity
@Table(name = "ASSISTANCES")
public class Assistance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "State")
	private String state;

	@ManyToOne
	@JoinColumn(name = "ID_EVENT")
	private Event event;

	@ManyToOne
	@JoinColumn(name = "ID_USER")
	private User user;

	public Assistance(String state, Event event, User user) {
		this.state = state;
		this.event = event;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
