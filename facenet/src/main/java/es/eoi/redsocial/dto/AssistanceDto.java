package es.eoi.redsocial.dto;

import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssistanceDto {

	private int id;
	private int state;
	private int iduser;
	private int idevent;
	
	
	public AssistanceDto() {

	}


	public AssistanceDto(int iduser, int idevent,int state) {	
		this.iduser = iduser;
		this.idevent = idevent;
		this.state = state;
	}


	
	
	
	
}
