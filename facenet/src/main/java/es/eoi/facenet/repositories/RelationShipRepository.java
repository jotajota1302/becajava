package es.eoi.facenet.repositories;

import org.aspectj.asm.internal.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationShipRepository extends JpaRepository<Relationship, Integer> {

}
