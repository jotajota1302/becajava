package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.redsocial.entities.Relationship;

@Repository
public interface IRelationshipRepository extends JpaRepository<Relationship, Integer> {

}
