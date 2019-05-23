package es.eoi.redsocial.test;

import static org.junit.Assert.assertEquals;
import java.util.Calendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
<<<<<<< Upstream, based on branch 'grupo4' of https://github.com/jotajota1302/becajava.git

import es.eoi.redsocial.entities.Message;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IMessageRepository;
import es.eoi.redsocial.repositories.IUserRepository;
=======
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.repositories.EventRepository;
import es.eoi.redsocial.repositories.UserRepository;
>>>>>>> ed57297 Event Repository(saveEvent)

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacenetApplicationTests {
	
	@Autowired
<<<<<<< Upstream, based on branch 'grupo4' of https://github.com/jotajota1302/becajava.git
	IUserRepository repository;
	@Autowired
	IMessageRepository mrepository;
=======
	EventRepository eventRepository;
	
	@Autowired
	UserRepository userRepository;
>>>>>>> ed57297 Event Repository(saveEvent)

	@Test
<<<<<<< Upstream, based on branch 'grupo4' of https://github.com/jotajota1302/becajava.git
	public void CreateUser_UserCreated() {

		// prepare
		User entity = new User();
		entity.setName("Lander");
		entity.setBirthDate(Calendar.getInstance().getTime());

		// act
		User user = repository.save(entity);

		// assert
		assertEquals(user.getName(), entity.getName());

=======
	public void contextLoads() {
		
		//-----------EVENTOS------------
		
		//guardar evento (funciona)
		/*
		 * Event event=new Event(); event.setName("Fiesta");
		 * event.setDescription("jkhkgyt");
		 * event.setEventDate(Calendar.getInstance().getTime());
		 * event.setUser(userRepository.findById(1).get());
		 * 
		 * eventRepository.save(event);
		 */
			
		
>>>>>>> ed57297 Event Repository(saveEvent)
	}

<<<<<<< Upstream, based on branch 'grupo4' of https://github.com/jotajota1302/becajava.git
	@Test
	public void CreateMessage_MessageCreated() {
		// Prepare
		User user = repository.findById(1).get();
		Message m = new Message();
		m.setContent("Hola esto es un mensaje");
		m.setPublishDate(Calendar.getInstance().getTime());
		m.setUserObject(user);

		// act
		Message message = mrepository.save(m);

		// assert
		assertEquals(message.getContent(), m.getContent());
	}

}
=======
}
>>>>>>> ed57297 Event Repository(saveEvent)
