package es.eoi.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.redsocial.entity.Relationship;

public interface RelationshipRepository extends JpaRepository<Relationship, Integer>{

}
