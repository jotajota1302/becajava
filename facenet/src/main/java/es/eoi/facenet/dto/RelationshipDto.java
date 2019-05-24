package es.eoi.facenet.dto;


public class RelationshipDto {
	

	private int id;


	private String state;


	private UserDto user1;


	private UserDto user2;

	
	public RelationshipDto(int id, String state, UserDto user1, UserDto user2) {
		this.id = id;
		this.state = state;
		this.user1 = user1;
		this.user2 = user2;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public UserDto getUser1() {
		return user1;
	}


	public void setUser1(UserDto user1) {
		this.user1 = user1;
	}


	public UserDto getUser2() {
		return user2;
	}


	public void setUser2(UserDto user2) {
		this.user2 = user2;
	}
	
	

}
