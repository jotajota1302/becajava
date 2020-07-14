package edu.es.eoi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.es.eoi.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = SpringDataJpaApplication.class)
public class UserRepositoryTest {
	
	@Autowired
	public UserRepository repository;
	
	@Test
	public void testFindByNombreOrSaldo() {
		
		System.out.println("hola");
		repository.findByNombreOrSaldo("JJ",50.0);
		repository.findById(1);
		System.out.println("adios");
	}

	
}
