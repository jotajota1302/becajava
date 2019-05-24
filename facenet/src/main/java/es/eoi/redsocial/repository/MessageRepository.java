package es.eoi.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.redsocial.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}
