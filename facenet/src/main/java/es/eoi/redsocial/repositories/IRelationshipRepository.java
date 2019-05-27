package es.eoi.redsocial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.redsocial.entities.Relationship;

public interface IRelationshipRepository extends JpaRepository<Relationship, Integer> {
	
	@Query(value = "SELECT r FROM Relationship r WHERE r.state = 2 AND r.sendUser LIKE :idsend")
	public List<Relationship> findRelationship(@Param("idsend")int id);

}
