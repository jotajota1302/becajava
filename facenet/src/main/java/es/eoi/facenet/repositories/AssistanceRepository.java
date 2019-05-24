package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.User;


public interface AssistanceRepository extends JpaRepository<Assistance, Integer> { 
	@Query("Select u from user u where id in (Select a.user.id_user from Assistance a where a.state='yes')")
	List<User> findByYesAssistance();

}