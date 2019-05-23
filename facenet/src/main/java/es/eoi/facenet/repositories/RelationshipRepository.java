package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.facenet.entities.Assistance;

public interface RelationshipRepository extends JpaRepository<Assistance, Intiger> { 
	
	
}


