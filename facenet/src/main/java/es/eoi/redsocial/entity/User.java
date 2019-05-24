package es.eoi.redsocial.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

	// Relacion tablas

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

	// Constructores

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public List<Reaction> getReaction() {
		return reaction;
	}

	public void setReaction(List<Reaction> reaction) {
		this.reaction = reaction;
	}

	public List<Relationship> getRelationship1() {
		return relationship1;
	}

	public void setRelationship1(List<Relationship> relationship1) {
		this.relationship1 = relationship1;
	}

	public List<Relationship> getRelationship2() {
		return relationship2;
	}

	public void setRelationship2(List<Relationship> relationship2) {
		this.relationship2 = relationship2;
	}

	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}

	public List<Assistance> getAssistance() {
		return assistance;
	}

	public void setAssistance(List<Assistance> assistance) {
		this.assistance = assistance;
	}

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
