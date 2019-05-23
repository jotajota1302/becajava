package es.eoi.facenet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RELATIONSHIPS")
public class Relationship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "STATE")
	private String name;

	@ManyToOne
	@JoinColumn(name = "id_user1", referencedColumnName = "id")
	private User user1;

	@ManyToOne
	@JoinColumn(name = "id_user2", referencedColumnName = "id")
	private User user2;

	public Relationship(String name, User user1, User user2) {
		this.name = name;
		this.user1 = user1;
		this.user2 = user2;
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
