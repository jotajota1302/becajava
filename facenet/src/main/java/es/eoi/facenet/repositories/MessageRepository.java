package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;


public interface MessageRepository extends JpaRepository<Message, Integer> { 
	
	@Query("Select m from Message m where m.id_user=:id")
	List<Message> findByUserId(@Param("id")int id);
	
	@Query("Select m from Message where m.user.id=:id in "
			+ "(SELECT r.user2.id FROM relationships r where r.state = 'friend' and r.user.id=:id)or"
			+ "(SELECT r.user1.id FROM relationships r where r.state = 'friend' and r.user.id=:id) ")
	List<Message> findByFriend(@Param("id")int id);
	


}