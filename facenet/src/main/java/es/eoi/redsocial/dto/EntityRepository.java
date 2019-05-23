package es.eoi.redsocial.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.redsocial.entity.TestEntity;


@Repository
public interface EntityRepository extends JpaRepository<TestEntity, Integer> {

}
