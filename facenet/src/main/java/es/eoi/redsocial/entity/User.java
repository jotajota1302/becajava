package es.eoi.redsocial.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "usuarios")
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "fechanacimiento")
	private Date fechaNacimiento;

	@Column(name = "fechaalta")
	private Date fechaAlta;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "pass")
	private String pass;
	
	//Relacion tablas

	@OneToMany(mappedBy = "user")
	private List<Message> message;

	@OneToMany(mappedBy = "user")
	private List<Reaction> reaction;

	@OneToMany(mappedBy = "user1")
	private List<Relationship> relationship1;

	@OneToMany(mappedBy = "user2")
	private List<Relationship> relationship2;
	
	@OneToMany(mappedBy = "user")
	private List<Event> event;

	@OneToMany(mappedBy = "user")
	private List<Assistance> assistance;
	
	//Constructores

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String nombre, String apellido, Date fechaNacimiento, Date fechaAlta, String usuario,
			String pass) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaAlta = fechaAlta;
		this.usuario = usuario;
		this.pass = pass;
	}
}
