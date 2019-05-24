package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.facenet.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("Select u from User u where u.user=:usuario and u.pass=:password ")
	User login(@Param("usuario")String usuario,
			@Param("password")String password);
}
