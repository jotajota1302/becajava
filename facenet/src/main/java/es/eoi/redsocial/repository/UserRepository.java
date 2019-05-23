package es.eoi.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.eoi.redsocial.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
