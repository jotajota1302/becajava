package es.eoi.redsocial.dto;

import java.util.Date;
import java.util.List;

import es.eoi.redsocial.entities.Assistance;
import es.eoi.redsocial.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventDto {

	private int id;
	private String name;
	private String description;
	private Date eventDate;
	private UserDto user;
	
	
	public EventDto() {

	}


	public EventDto(int id, String name, String description, Date eventDate, UserDto user) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.eventDate = eventDate;
		this.user = user;

	}
	
	
}
