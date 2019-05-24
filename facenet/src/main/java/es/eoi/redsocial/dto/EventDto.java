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
	private User user;
	private List<Assistance> assistance;
}
