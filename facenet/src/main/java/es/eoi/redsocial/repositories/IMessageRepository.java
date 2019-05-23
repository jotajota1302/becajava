package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.redsocial.entities.Message;

@Repository
public interface IMessageRepository extends JpaRepository<Message, Integer>  {

}
