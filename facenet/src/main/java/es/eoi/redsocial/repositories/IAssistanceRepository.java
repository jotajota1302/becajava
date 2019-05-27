package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import es.eoi.redsocial.entities.Assistance;



public interface IAssistanceRepository extends JpaRepository<Assistance, Integer> {

	@Query("select a from assists a where a.idevent= ?1 AND a.state=1")
	Assistance findUsersFromEvent(int idevent);
	

}
