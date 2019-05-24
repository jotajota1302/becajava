package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.facenet.entities.Relationship;

public interface RelationshipRepository extends JpaRepository<Relationship, Integer>{

}
