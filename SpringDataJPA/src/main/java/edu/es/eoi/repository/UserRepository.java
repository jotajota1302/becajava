package edu.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
