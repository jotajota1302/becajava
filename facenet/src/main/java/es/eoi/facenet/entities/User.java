package es.eoi.facenet.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="NAME")
	private String name;
	
	@Column(name ="SURNAME")	
	private String surname;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDATE")
	private Date birthdate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "STARDATE")
	private Date stardate;
	
	@Column(name ="USER")
	private String user;
	
	@Column(name ="PASS")
	private String pass;
	
	@OneToMany(mappedBy = "user")
	private List<Relationship> relationships1;
	
	@OneToMany(mappedBy = "user")
	private List<Relationship> relationships2;
	
	@OneToMany(mappedBy = "user")
	private List<Reaction> reactions;
	
	@OneToMany(mappedBy = "user")
	private List<Assistance> assistances;
	
	@OneToMany(mappedBy = "user")
	private List<Message> messages;
	
	@OneToMany(mappedBy = "user")
	private List<Event> events;
}
