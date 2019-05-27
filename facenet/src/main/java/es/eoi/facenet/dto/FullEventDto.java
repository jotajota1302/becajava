package es.eoi.facenet.dto;

import java.util.Date;
import java.util.List;

public class FullEventDto {
	
	private int id;

	private String name;

	private String description;

	private Date eventDate;

	private UserDto user;
	
	private List<AssistanceDto> asistencias;
	
	public FullEventDto(int id, String name, String description, Date eventDate, UserDto user,
			List<AssistanceDto> asistencias) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.eventDate = eventDate;
		this.user = user;
		this.asistencias = asistencias;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public List<AssistanceDto> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(List<AssistanceDto> asistencias) {
		this.asistencias = asistencias;
	}
	
	

}
