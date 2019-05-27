package es.eoi.redsocial.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RelationshipDto {
	private int id;
	private int idreceive;
	private int idsend;
	private int state;
	
	public RelationshipDto(){
		
	}

	public RelationshipDto(int id, int idreceive, int idsend, int state) {
		this.id = id;
		this.idreceive = idreceive;
		this.idsend = idsend;
		this.state = state;
	}	
}
