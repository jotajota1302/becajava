package es.eoi.facenet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "RELATIONSHIPS")
public class Relationship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="STATE")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user1", referencedColumnName = "id")
	private User user1;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user2", referencedColumnName = "id")
	private User user2;
}
