package es.eoi.facenet.dto;



public class AssistanceDto {

	private int id;


	private String state;


	private EventDto event;


	private UserDto user;


	public AssistanceDto(int id, String state, EventDto event, UserDto user) {
		this.id = id;
		this.state = state;
		this.event = event;
		this.user = user;
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


	public EventDto getEvent() {
		return event;
	}


	public void setEvent(EventDto event) {
		this.event = event;
	}


	public UserDto getUser() {
		return user;
	}


	public void setUser(UserDto user) {
		this.user = user;
	}



	

}
