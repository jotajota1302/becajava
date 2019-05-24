package es.eoi.redsocial.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.redsocial.entities.Reaction;

@Repository
public interface IReactionRepository extends JpaRepository<Reaction, Integer>{

}
