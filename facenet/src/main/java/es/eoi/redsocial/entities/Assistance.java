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


@Entity
@Table(name = "assists")
@Getter
@Setter
public class Assistance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "state")
	private int state;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iduser")
	private User userObject;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idevent")
	private Event event;

	public Assistance() {

	}

	public Assistance(User user, Event event,int state) {
		this.state = state;
		this.userObject = user;
		this.event = event;
	}

}
