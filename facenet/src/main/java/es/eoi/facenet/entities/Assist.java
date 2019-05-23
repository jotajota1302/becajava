package es.eoi.facenet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Assistents")
public class Assist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String state;
	
}
