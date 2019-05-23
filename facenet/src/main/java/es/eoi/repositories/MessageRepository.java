package es.eoi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.eoi.redsocial.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

}
