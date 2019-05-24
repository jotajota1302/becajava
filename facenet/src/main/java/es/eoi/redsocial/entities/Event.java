package es.eoi.redsocial.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "events")
@Getter
@Setter
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "eventdate")
	private Date eventDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iduser")
	private User user;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	private List<Assistance> assistances;

	public Event() {

	}

	public Event(String name, String description, Date eventDate, User user) {
		this.name = name;
		this.description = description;
		this.eventDate = eventDate;
		this.user = user;
		this.assistances = assistances;
	}

}
