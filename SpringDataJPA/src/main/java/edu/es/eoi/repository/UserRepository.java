package edu.es.eoi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, PagingAndSortingRepository<User, Integer> {
	
	public List<User> findByNombre(String nombre);
	public List<User> findByNombreAndSaldo(String nombre,Double saldo);
	public List<User> findByNombreOrSaldo(String nombre,Double saldo);
	public List<User> findByFechaBetween(Date from,Date to);
	public List<User> findByFechaBefore(Date date);
	public List<User> findByFechaAfter(Date date);
	public List<User> findBySaldoLessThan(Double saldo);
	public List<User> findBySaldoLessThanEqual(Double saldo);
	public List<User> findByFechaIsNull();
	public List<User> findByNombreLike(String nombre);
	public List<User> findFirstByOrderBySaldoDesc();	

}
