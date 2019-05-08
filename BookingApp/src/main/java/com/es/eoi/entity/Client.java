package com.es.eoi.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
	
	private String dni;
	
	private String name;
	
	private String surname;
	
	private Date birthDate;	

}
