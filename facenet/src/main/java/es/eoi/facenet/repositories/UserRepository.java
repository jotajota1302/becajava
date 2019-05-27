package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.eoi.facenet.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "SELECT * FROM USERS WHERE USERNAME LIKE =?1  AND PASS =?2")
	User findAllActiveUsers(String userName, String pass);
}
