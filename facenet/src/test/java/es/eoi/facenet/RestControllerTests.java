package es.eoi.facenet;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RestControllerTests {

	@LocalServerPort
	public int randomServerPort;

	@Autowired
	UserRepository repository;

	@Test
	public void RestGetUser_IdAsParam_UserReturned() {

		// prepare
		User entity = new User();
		entity.setName("NAME");

		entity = repository.save(entity);

		// act
		TestRestTemplate testRestTemplate = new TestRestTemplate();
		String response = testRestTemplate
				.getForObject("http://localhost:" + getRandomPort() + "user/" + entity.getId(), String.class);

		// assert
		assertNotNull("",response);

	}

	private int getRandomPort() {
		return this.randomServerPort;
	}

	@After
	public void clear() {
		repository.deleteAll();
	}

}
