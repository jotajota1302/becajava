package es.eoi.redsocial.dto;

import java.util.Date;
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


	public EventDto(String name, String description, Date eventDate, UserDto user) {

		this.name = name;
		this.description = description;
		this.eventDate = eventDate;
		this.user = user;

	}
	
	
}
