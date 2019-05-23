package es.eoi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.eoi.redsocial.entity.Relationship;

@Repository
public interface RelationshipRepository extends JpaRepository<Relationship, Integer>{

}
