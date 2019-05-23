package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.redsocial.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
	
}
