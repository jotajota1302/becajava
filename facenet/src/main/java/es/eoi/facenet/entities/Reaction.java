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
@Table(name = "REACTIONS")
public class Reaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "REACTIONTYPE")
	private String reactiontype;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_message", referencedColumnName = "id")
	private Message message;
}
