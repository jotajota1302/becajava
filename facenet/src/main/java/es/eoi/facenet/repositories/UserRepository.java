package es.eoi.facenet.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import es.eoi.facenet.entities.User;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>,QueryByExampleExecutor <User>{

}
