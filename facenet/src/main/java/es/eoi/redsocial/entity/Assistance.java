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

}
