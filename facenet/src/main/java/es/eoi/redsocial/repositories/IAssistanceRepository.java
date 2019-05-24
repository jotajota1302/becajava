package es.eoi.redsocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.redsocial.entities.Assistance;

@Repository
public interface IAssistanceRepository extends JpaRepository<Assistance, Integer> {

}
