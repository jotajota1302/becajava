package es.eoi.facenet.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.User;

public class MessageDto {
	

	private int id;
	

	private String content;
	

	private Date publishdate;
	

	private UserDto user;
	

	private List<ReactionDto> reactions;


	public MessageDto(int id, String content, Date publishdate, UserDto user, List<ReactionDto> reactions) {
		this.id = id;
		this.content = content;
		this.publishdate = publishdate;
		this.user = user;
		this.reactions = reactions;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getPublishdate() {
		return publishdate;
	}


	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}


	public UserDto getUser() {
		return user;
	}


	public void setUser(UserDto user) {
		this.user = user;
	}


	public List<ReactionDto> getReactions() {
		return reactions;
	}


	public void setReactions(List<ReactionDto> reactions) {
		this.reactions = reactions;
	}
	
	

}
