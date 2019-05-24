package es.eoi.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.redsocial.entity.Reaction;

public interface ReactionRepository extends JpaRepository<Reaction, Integer>{

}
