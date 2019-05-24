package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.facenet.entities.Assist;

public interface AssistRepository extends JpaRepository<Assist, Integer> {

}
