package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.facenet.entities.Assistance;

public interface MessageRepository extends JpaRepository<Assistance, Intiger> { 
	
	
}


