package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.redsocial.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
