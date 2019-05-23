package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.facenet.entities.Event;


@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

}
