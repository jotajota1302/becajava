package es.eoi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.eoi.redsocial.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{

}
