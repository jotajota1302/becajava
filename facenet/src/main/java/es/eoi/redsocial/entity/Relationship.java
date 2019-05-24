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

	@ManyToOne()
	@JoinColumn(name = "idusuario1")
	private User user1;

	@ManyToOne()
	@JoinColumn(name = "idusuario2")
	private User user2;

	public Relationship() {
		super();
	}

	public Relationship(int id, String estado, User user1, User user2) {
		super();
		this.id = id;
		this.estado = estado;
		this.user1 = user1;
		this.user2 = user2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}
	
}
