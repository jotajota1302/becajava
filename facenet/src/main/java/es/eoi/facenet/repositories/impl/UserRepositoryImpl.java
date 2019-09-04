package es.eoi.facenet.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.querydsl.jpa.impl.JPAQueryFactory;

import es.eoi.facenet.entities.QUser;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.UserRepositoryCustom;



public class UserRepositoryImpl implements UserRepositoryCustom{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<User> findByName(String name) {

		JPAQueryFactory queryFactory= new JPAQueryFactory(em);
		
		QUser user=QUser.user1;
		
		List<User> list=queryFactory.selectFrom(user).where(user.name.eq(name)).fetch();
		
		return list;
	}

}
