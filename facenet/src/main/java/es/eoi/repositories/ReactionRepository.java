package es.eoi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.eoi.redsocial.entity.Reaction;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Integer>{

}
