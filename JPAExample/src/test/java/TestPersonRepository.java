import static org.junit.Assert.fail;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.es.eoi.entities.Person;
import com.es.eoi.repositories.PersonRepository;

public class TestPersonRepository {

	PersonRepository repository;
	
	@Before
	public void setUp() throws Exception {
		
		Logger log = Logger.getLogger("org.hibernate.SQL");
		log.setLevel(Level.DEBUG);	
		repository= new PersonRepository();
	}

	@Test
	public void testCreate() {
		
//		Person person= new Person();
//		person.setName("OTRO NOMBRE");
//		person.setSurname("OTRO APELLIDO");		
//		repository.create(person);
	}

	@Test
	public void testFindAll() {
		System.out.println(repository.findAll());
	}

	@Test
	public void testFindById() {
		Person var = repository.findById(1);
		System.out.println(var.getName());
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}	
	
}
