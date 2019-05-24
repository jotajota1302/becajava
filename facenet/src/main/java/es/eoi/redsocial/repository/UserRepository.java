package es.eoi.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.eoi.redsocial.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select * from user * where u.id = ?")
	User findById(int id);

	@Query("select * from user * where user like ? and pass like ?")
	User login(String user, String pass);
	
	@Query("select * from relationship * where relationship like friend")
	User friendRelationships(String friendlist);
	
	@Query("select * from relationship * where relationship like pending")
	User pendingRelationships(String pendinglist);
	
}
