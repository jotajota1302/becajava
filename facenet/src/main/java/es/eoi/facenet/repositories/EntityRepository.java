package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.facenet.entities.TestEntity;


@Repository
public interface EntityRepository extends JpaRepository<TestEntity, Integer> {

}
