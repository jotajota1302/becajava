package es.eoi.facenet.services;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.facenet.entities.Reaction;

public interface ReactionService extends JpaRepository<Reaction, Integer> {

}
