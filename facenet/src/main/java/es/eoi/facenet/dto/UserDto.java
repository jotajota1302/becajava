package es.eoi.facenet.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class UserDto {

	private int id;

	private String name;

	private String surname;

	private Date birthdate;

	private Date stardate;

	private String user;

	private String pass;

	public UserDto(int id, String name, String surname, Date birthdate, Date stardate, String user, String pass) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.stardate = stardate;
		this.user = user;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getStardate() {
		return stardate;
	}

	public void setStardate(Date stardate) {
		this.stardate = stardate;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
