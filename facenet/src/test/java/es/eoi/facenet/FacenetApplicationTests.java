package es.eoi.facenet;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacenetApplicationTests {

	@Autowired
	UserRepository repository;

	
	@Test	
	public void CreateUser_UserCreated() {

		// prepare
		User entity = new User();
		entity.setName("Jose");
		entity.setBirthDate(Calendar.getInstance().getTime());

		// act
		User user = repository.save(entity);

		// assert
		assertEquals(user.getName(), entity.getName());		

	}
	
	@Test	
	public void UpdateUser_UserUpdated() {

		// prepare
		User entity = new User();
		entity.setName("Jose");
		entity.setBirthDate(Calendar.getInstance().getTime());
		repository.save(entity);
		
		// act
		entity.setPassword("PASSWORD");
		User user=repository.save(entity);

		// assert
		assertEquals("PASSWORD", user.getPassword());		

	}
	
	@Test
	@Transactional
	public void MakeRelationBetweenUsers_RelationCreated() {

		// prepare
		User entity1 = new User();
		entity1.setName("Jose");
		entity1.setBirthDate(Calendar.getInstance().getTime());
		
		User entity2 = new User();
		entity2.setName("Pedro");
		entity2.setBirthDate(Calendar.getInstance().getTime());
		
		Set<User> referencesTo= new HashSet<User>();
		Set<User> referencesFrom= new HashSet<User>();
		
		referencesTo.add(entity2);
		referencesFrom.add(entity1);
		
		entity1.setReferencesTo(referencesTo);
		entity2.setReferencesFrom(referencesFrom);

		// act
		User user1 = repository.save(entity1);
		User user2 = repository.save(entity2);
		
		// assert
		assertEquals(user1.getName(), entity1.getName());		
		assertEquals(user2.getName(), entity2.getName());		

	}

	@After
	public void cleanDataBase(){		
		repository.deleteAll();
	}

}
