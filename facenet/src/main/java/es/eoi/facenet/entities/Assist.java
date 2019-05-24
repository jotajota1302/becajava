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
@Table(name = "Assistents")
public class Assist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_assist;

	@Column(name = "state")
	private String state;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_event")
	private Event event;

	public Assist(Integer id_assist) {
		this.id_assist = id_assist;
	}

	public Assist() {
	}

	public Integer getId_assist() {
		return id_assist;
	}

	public void setId_assist(Integer id_assist) {
		this.id_assist = id_assist;
	}
}
