package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.redsocial.entities.Assistance;

public interface AssistanceRepository extends JpaRepository<Assistance, Integer> {

}
