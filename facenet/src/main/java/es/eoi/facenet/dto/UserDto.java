package es.eoi.facenet.dto;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.Message;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
public class UserDto {
	
	private int id;

	private String name;

	private String surname;
	
	private Date birthDate;
	
	private Date startDate;
	
	private String user;

	private String password;

	private Set<UserDto> referencesTo;
	
	private Set<UserDto> referencesFrom;
	
	Set<Message> posts;	
	
	Set<Event> events;
	
}
