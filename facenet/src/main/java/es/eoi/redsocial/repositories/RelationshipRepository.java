package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.redsocial.entities.Relationship;

public interface RelationshipRepository extends JpaRepository<Relationship, Integer> {

}
