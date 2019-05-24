package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.eoi.facenet.entities.Assistance;

public interface AssistanceRepository extends JpaRepository<Assistance, Integer> { 
	@Query("select u from Assistance u where u.id_user AND u.state = YES")
	User findByYesAssistance();
	
	@Query("select u from Assistance u where u.state = NO")
	User findByYesAssistance();
	
	@Query("select e from Assistance e where e.state = YES")
	Event findByYesAssistance();
	
	@Query("select e from Assistance e where e.state = NO")
	Event findByNoAssistance();
}