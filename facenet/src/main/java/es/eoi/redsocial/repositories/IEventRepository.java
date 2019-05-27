package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.eoi.redsocial.entities.Event;


public interface IEventRepository extends JpaRepository<Event, Integer> {

	@Query("SELECT name FROM {#event} WHERE iduser=:iduser") 
	Event findEventsFromUsers(@Param("iduser") int iduser);

}
