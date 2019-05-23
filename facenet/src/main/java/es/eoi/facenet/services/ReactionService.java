package es.eoi.facenet.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Reaction;

@Service
public interface ReactionService extends JpaRepository<Reaction, Integer> {

}
