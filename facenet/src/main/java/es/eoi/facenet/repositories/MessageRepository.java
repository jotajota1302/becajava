package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.facenet.entities.Message;


@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
