package es.eoi.redsocial.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="relationships")
public class Relationship {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="state")
	private int state;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_receive")
	private User receiveUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_send")
	private User sendUser;

	public Relationship() {

	}

	public Relationship(int id, int state, User receiveUser, User sendUser) {
		this.id = id;
		this.state = state;
		this.receiveUser = receiveUser;
		this.sendUser = sendUser;
	}
}
