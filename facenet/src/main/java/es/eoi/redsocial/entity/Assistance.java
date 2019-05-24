package es.eoi.redsocial.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "asistencia")
public class Assistance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "estado")
	private String state;

	@ManyToOne()
	@JoinColumn(name = "idevento")
	private Event event;

	@ManyToOne()
	@JoinColumn(name = "idusuario")
	private User user;

	public Assistance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assistance(int id, String state, Event event, User user) {
		super();
		this.id = id;
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
