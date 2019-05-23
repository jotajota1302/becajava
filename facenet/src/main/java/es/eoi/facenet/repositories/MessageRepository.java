package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysql.cj.protocol.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> { 

}