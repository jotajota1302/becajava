package edu.es.eoi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public List<User> findByNombreOrSaldo(String nombre,Double saldo);
	

}
