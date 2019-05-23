package es.eoi.redsocial.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "relaciones")
public class Relationship {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "estado")
	private String estado;

	private User user1;

	private User user2;

	public Relationship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Relationship(int id, String estado, User user1, User user2) {
		super();
		this.id = id;
		this.estado = estado;
		this.user1 = user1;
		this.user2 = user2;
	}
}
