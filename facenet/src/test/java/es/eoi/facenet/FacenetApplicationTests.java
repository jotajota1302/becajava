package es.eoi.facenet;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.repositories.EventRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacenetApplicationTests {
	
	@Autowired
	EventRepository eventRepository;

	@Test
	public void contextLoads() {
		
		Event entity=new Event();
		entity.setName("Pepe");
		entity.setDescription("ddfgadgdga");
		entity.setEventDate(Calendar.getInstance().getTime());
		
		Event event=eventRepository.save(entity);
		
		assertEquals(event.getName(), entity.getName());	
		
	}

}
