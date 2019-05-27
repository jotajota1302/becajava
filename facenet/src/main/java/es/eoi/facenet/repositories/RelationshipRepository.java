package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.facenet.entities.Relationship;

public interface RelationshipRepository extends JpaRepository<Relationship, Integer> { 
	

	@Query("SELECT r FROM Relationship r where r.state='PENDING' and r.user2.id=:id_user2")
	List<Relationship> relationshipPending(@Param("id_user2")int id_user2);
	
	//Select * from relationships where state='Pending' and (id_user2 = 2 or id_user1=2);
	@Query("SELECT r FROM Relationship r where r.state='FRIEND' and (r.user2.id =:id_user2 or r.user1.id=:id_user2)")
	List<Relationship> relationshipFriend(@Param("id_user2")int id_user2);

}