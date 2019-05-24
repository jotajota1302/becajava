package es.eoi.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.redsocial.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
