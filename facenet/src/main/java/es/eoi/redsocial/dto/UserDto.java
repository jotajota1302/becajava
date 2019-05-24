package es.eoi.redsocial.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	private int id;
	private String name;
	private String surname;
	private Date birthDate;
	private Date startDate;
	private String user;
	private String password;
	
	public UserDto() {
		
	}
	
	public UserDto(int id, String name, String surname, Date birthDate, Date startDate, String user,
			String password) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.user = user;
		this.password = password;
	}
	
	
}
