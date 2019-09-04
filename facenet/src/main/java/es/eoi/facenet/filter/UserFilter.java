package es.eoi.facenet.filter;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserFilter {	
	
	private int id;

	private String name;

	private String surname;
	
	private Date birthDate;
	
	private Date startDate;
	
	private String user;

	private String password;

}
