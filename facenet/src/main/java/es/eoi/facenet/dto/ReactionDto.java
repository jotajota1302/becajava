package es.eoi.facenet.dto;


public class ReactionDto {

	private int id;
	

	private String reactiontype;
	

	private UserDto user;
	

	private MessageDto message;
	
	
	public ReactionDto(int id, String reactiontype, UserDto user, MessageDto message) {
		this.id = id;
		this.reactiontype = reactiontype;
		this.user = user;
		this.message = message;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getReactiontype() {
		return reactiontype;
	}


	public void setReactiontype(String reactiontype) {
		this.reactiontype = reactiontype;
	}


	public UserDto getUser() {
		return user;
	}


	public void setUser(UserDto user) {
		this.user = user;
	}


	public MessageDto getMessage() {
		return message;
	}


	public void setMessage(MessageDto message) {
		this.message = message;
	}
	
	
}
