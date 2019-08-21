import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.es.eoi.entities.Adress;
import com.es.eoi.entities.Person;
import com.es.eoi.repositories.PersonRepository;

public class TestPersonRepository {

	PersonRepository repository;
	
	Logger logger=Logger.getLogger(TestPersonRepository.class);
	
	@Before
	public void setUp() throws Exception {
		
		Logger log = Logger.getLogger("org.hibernate.SQL");
		log.setLevel(Level.DEBUG);	
		repository= new PersonRepository();
	}

	@Test
	public void testCreate() {
		
		Adress adress= new Adress();		
		adress.setAdress("C/pueblo acantilao");				
		
		Person person= new Person();
		person.setName("PEPE");
		person.setSurname("PERICO");	
		
		adress.setPerson(person);		
		person.setAdress(adress);
				
		repository.create(person);
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

	
	
}
