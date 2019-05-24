package es.eoi.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.redsocial.entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{

}
