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

	@Column(name = "id_user")
	private Integer id_user;

	@Column(name = "id_event")
	private Integer id_event;

	// mapeo
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_event")
	private Event event;
	
	
	public Assist(Integer id_assist, Integer id_user, Integer id_event) {
		this.id_assist = id_assist;
		this.id_user = id_user;
		this.id_event = id_event;
	}

	public Assist() {
	}

	public Integer getId_assist() {
		return id_assist;
	}

	public void setId_assist(Integer id_assist) {
		this.id_assist = id_assist;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	public Integer getId_event() {
		return id_event;
	}

	public void setId_event(Integer id_event) {
		this.id_event = id_event;
	}
}
