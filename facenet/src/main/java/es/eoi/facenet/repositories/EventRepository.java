package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.facenet.entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer> { 
	
}