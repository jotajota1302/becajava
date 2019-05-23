package es.eoi.redsocial.repositories;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.redsocial.entities.Reaction;

@Entity
public interface IReactionRepository extends JpaRepository<Reaction, Integer>{

}
