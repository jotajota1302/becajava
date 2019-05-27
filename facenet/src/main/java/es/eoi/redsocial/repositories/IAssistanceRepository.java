package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.redsocial.entities.Assistance;



public interface IAssistanceRepository extends JpaRepository<Assistance, Integer> {

	

}
