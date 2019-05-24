package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.redsocial.entities.Event;

@Repository
public interface IEventRepository extends JpaRepository<Event, Integer> {

}
