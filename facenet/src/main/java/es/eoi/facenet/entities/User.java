package es.eoi.facenet.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surName;
	
	@Column(name = "birthdate")
	private Date birthDate;
	
	@Column(name = "startdate")
	private Date startDate;
	
	@Column(name = "username")
	private String userName;
	
	
	
	public User() {
		
	}

	public User(int id, String name, String surName, Date birthDate, Date startDate, String userName) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.userName = userName;
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

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
