package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;


public interface AssistanceRepository extends JpaRepository<Assistance, Integer> { 
	@Query("Select u from user u where id in (Select a.user.id_user from Assistance a where a.state='yes')")
	List<User> findByUsersYesAssistance();

	@Query("Select u from user u where id in (Select a.user.id_user from Assistance a where a.state='no')")
	List<User> findByUsersNotAssistance();
	
	@Query("Select e from event e where id in (Select e.event.id_event from Assistance a where a.state='yes')")
	List<Event> findByEventYesAssistance();
	
	@Query("Select e from event e where id in (Select e.event.id_event from Assistance a where a.state='no')")
	List<Event> findByEventNotAssistance();
}