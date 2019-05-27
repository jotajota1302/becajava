package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.facenet.entities.Reaction;

public interface ReactionRepository extends JpaRepository<Reaction, Integer> { 
	
	@Query("SELECT r FROM Reaction r where r.message.id=:id")
	List<Reaction> reactionList(@Param("id")int id);

}