package es.eoi.redsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.eoi.redsocial.entity.Relationship;
import es.eoi.redsocial.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select u from User u where u.id = ?")
	User findById(int id);

	@Query("select u from User u where u.usuario like ? and u.pass like ?")
	User login(String user, String pass);
	
	@Query("select r from Relationship r where r.relaciones like friend")
	List<Relationship> friendRelationships();
	
	@Query("select r from Relationship r where r.relaciones like pending")
	List<Relationship> pendingRelationships();
	
}
