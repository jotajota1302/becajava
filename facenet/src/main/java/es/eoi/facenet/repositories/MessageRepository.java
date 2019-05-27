package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.facenet.entities.Message;
public interface MessageRepository extends JpaRepository<Message, Integer> {

	@Query("Select m from Message m where m.user.id=:id")
	List<Message> findByUserId(@Param("id") int id);

	@Query("Select m from Message where "
			+ "m.user.id=("
			+ "SELECT r.user2.id FROM Relationships r where r.state = 'FRIEND' and r.user1.id=:id)"
			+ " or m.user.id=("
			+ "SELECT r.user1.id FROM Relationships r where r.state = 'FRIEND' and r.user2.id=:id)")
	List<Message> findByFriend(@Param("id") int id);

}