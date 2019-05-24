package es.eoi.redsocial.test;

import static org.junit.Assert.assertEquals;
import java.util.Calendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import es.eoi.redsocial.entities.Assistance;
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.entities.Message;
import es.eoi.redsocial.entities.Reaction;
import es.eoi.redsocial.entities.Relationship;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IAssistanceRepository;
import es.eoi.redsocial.repositories.IEventRepository;
import es.eoi.redsocial.repositories.IMessageRepository;
import es.eoi.redsocial.repositories.IReactionRepository;
import es.eoi.redsocial.repositories.IUserRepository;
import es.eoi.redsocial.repositories.IRelationshipRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacenetApplicationTests {

	@Autowired
	IUserRepository repository;
	@Autowired
	IMessageRepository mrepository;
	@Autowired
	IEventRepository eventRepository;
	@Autowired
	IAssistanceRepository assistanceRepository;
	@Autowired
	IRelationshipRepository relationshipRepository;
	@Autowired
	IReactionRepository rrepository;
	@Test
	public void CreateUser_UserCreated() {

		// prepare
		User entity = new User();
		entity.setName("Lander");
		entity.setBirthDate(Calendar.getInstance().getTime());

		// act
		User user = repository.save(entity);

		 assertEquals(user.getName(), entity.getName());

	}

	@Test
	public void CreateMessage_MessageCreated1() {
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

	@Test
	public void createEvent_EventCreated() {
		
		Event event = new Event();
		event.setName("Fiesta");
		event.setDescription("jkhkgyt");
		event.setEventDate(Calendar.getInstance().getTime());
		event.setUserObject(repository.findById(1).get());

		eventRepository.save(event);

	}
	
	@Test
	public void createAssistance_assistanceCreated() {
		Assistance assistance = new Assistance();
		assistance.setUserObject(repository.findById(1).get());
		assistance.setEvent(eventRepository.findById(7).get());
		assistance.setState(1);

		assistanceRepository.save(assistance);
	}
	
	@Test
	public void createRelationship_RelationshipCreated() {
		Relationship relationship= new Relationship();
		relationship.setReceiveUser(repository.findById(1).get());
		relationship.setSendUser(repository.findById(2).get());
		relationship.setState(1);
		
		relationshipRepository.save(relationship);
	}

//	@Test
//	public void CreateReaction_ReactionCreated() {
//		// Prepare
//		User user = repository.findById(1).get();
//		Message m = mrepository.findById(1).get();
//		Reaction r = new Reaction();
//		r.setReactionType(1);
//		r.setMessageObject(m);
//		r.setUserObject(user);
//		// act
//		Reaction reaction = rrepository.save(r);
//
//		// assert
//		assertEquals(reaction.getReactionType(), r.getReactionType());
//	}
}