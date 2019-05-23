package es.eoi.redsocial.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "asistencia")
public class Event {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "fechaevento")
	private Date fechaEvento;

	@ManyToOne()
	@JoinColumn(name = "idusuario")
	private User user;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(int id, String nombre, String descripcion, Date fechaEvento, User user) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaEvento = fechaEvento;
		this.user = user;
	}

}
