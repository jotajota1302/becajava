package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.facenet.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> { 

}