package es.eoi.facenet.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String name;

	@Column
	private String surname;

	@Column
	private Date birthDate;

	@Column
	private Date startDate;

	@Column
	private String user;

	@Column
	private String password;

	@ManyToMany
	private Set<User> referencesTo;

	@ManyToMany(mappedBy = "referencesTo")
	private Set<User> referencesFrom;

}
