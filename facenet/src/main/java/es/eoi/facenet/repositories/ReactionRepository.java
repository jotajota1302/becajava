package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.Reaction;

public interface ReactionRepository extends JpaRepository<Reaction, Integer> { 
	
	
}


