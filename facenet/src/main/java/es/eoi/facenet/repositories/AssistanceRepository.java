package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;


public interface AssistanceRepository extends JpaRepository<Assistance, Integer> { 
	@Query("Select u from User u where u.id in (Select a.user.id from Assistance a where a.state='yes'  and a.event.id=:id_event)")
	List<User> findByUsersYesAssistance(@Param("id_event")int id_event);

	@Query("Select u from User u where u.id in (Select a.user.id from Assistance a where a.state='no' and a.event.id=:id_event)")
	List<User> findByUsersNotAssistance(@Param("id_event")int id_event);
	
	@Query("Select e from Event e where e.id in (Select a.event.id from Assistance a where a.state='yes' and a.user.id=:id_user)")
	List<Event> findByEventYesAssistance(@Param("id_user")int id_user);
	
	@Query("Select e from Event e where e.id in (Select a.event.id from Assistance a where a.state='no' and a.user.id=:id_user)")
	List<Event> findByEventNotAssistance(@Param("id_user")int id_user);
}