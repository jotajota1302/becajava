package es.eoi.facenet.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "MESSAGES")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "PUBLISHDATE")
	private Date publishdate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;
	
	@OneToMany(mappedBy = "reaction")
	private List<Reaction> reactions;
}
