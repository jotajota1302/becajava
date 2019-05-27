package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.redsocial.entities.Event;


public interface IEventRepository extends JpaRepository<Event, Integer> {

	

}
