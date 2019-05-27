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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_RELATIONSHIP", unique=true)
	private int id_relationship;
	
	@Column(name="STATE")
	private String state;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user1")
	private User user1;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user2")
	private User user2;

	public Relationship() {
	}

	public Relationship(int id_relationship, String state, User user1, User user2) {
		super();
		this.id_relationship = id_relationship;
		this.state = state;
		this.user1 = user1;
		this.user2 = user2;
	}

	public int getId_relationship() {
		return id_relationship;
	}

	public void setId_relationship(int id_relationship) {
		this.id_relationship = id_relationship;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
