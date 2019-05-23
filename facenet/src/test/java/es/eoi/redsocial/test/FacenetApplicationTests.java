package es.eoi.redsocial.test;


import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacenetApplicationTests {

	@Autowired
	IUserRepository repository;

	@Test
	public void CreateUser_UserCreated() {

		// prepare
		User entity = new User();
		entity.setName("Guillermo");
		entity.setBirthDate(Calendar.getInstance().getTime());

		// act
		User user = repository.save(entity);

		// assert
		assertEquals(user.getName(), entity.getName());

	}

}