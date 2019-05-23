package es.eoi.redsocial.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "mensajes")
public class Message {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="contenido")
	private String contenido;
	
	@Column(name="fechapublicacion")
	private Date fechaPublicacion;
	
	@ManyToOne()
	@JoinColumn(name = "idusuario")
	private User user;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(int id, String contenido, Date fechaPublicacion, User user) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.fechaPublicacion = fechaPublicacion;
		this.user = user;
	}

}
