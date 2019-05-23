package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.facenet.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
