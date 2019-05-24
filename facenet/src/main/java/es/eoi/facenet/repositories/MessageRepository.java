package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.facenet.entities.Message;


public interface MessageRepository extends JpaRepository<Message, Integer> { 
	
	@Query("Select m from Message m where m.id_user=:id")
	List<Message> findByUserId(@Param("id")int id);

}