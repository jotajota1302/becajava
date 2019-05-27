package es.eoi.facenet.rest;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.dto.AssistanceDto;
import es.eoi.facenet.dto.EventDto;
import es.eoi.facenet.dto.MessageDto;
import es.eoi.facenet.dto.ReactionDto;
import es.eoi.facenet.dto.RelationshipDto;
import es.eoi.facenet.dto.UserDto;
import es.eoi.facenet.dto.fullUserDto;
import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.Relationship;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.RelationshipService;
import es.eoi.facenet.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
	@Autowired
	private UserService serviceUser;

	@Autowired
	private RelationshipService serviceRelationship;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDto>> findEvents() {
		ModelMapper mapper = new ModelMapper();
		List<User> users = serviceUser.findAll();
		List<UserDto> usersDto;
		java.lang.reflect.Type targetListType = new TypeToken<List<UserDto>>() {
		}.getType();
		usersDto = mapper.map(users, targetListType);
		return new ResponseEntity<>(usersDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<UserDto> findUserbyId(@PathVariable(value = "id") int id) {
		User user = serviceUser.findById(id);
		UserDto userDto = new UserDto(user.getId(), user.getName(), user.getSurname(), user.getBirthdate(),
				user.getStardate(), user.getUser(), user.getPass());
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fullUser/{id}")
	public ResponseEntity<fullUserDto> findfullUser(@PathVariable(value = "id") int id) {
		ModelMapper mapper = new ModelMapper();
		User user = serviceUser.findById(id);
		List<Relationship> relaciones1 = user.getRelationships1();
		List<Relationship> relaciones2 = user.getRelationships2();
		List<Reaction> reacciones = user.getReactions();
		List<Assistance> assistances = user.getAssistances();
		List<Message> messages = user.getMessages();
		List<Event> events = user.getEvents();

		List<RelationshipDto> relacionesDto1;
		List<RelationshipDto> relacionesDto2;
		List<ReactionDto> reaccionesDto;
		List<AssistanceDto> assistancesDto;
		List<MessageDto> messagesDto;
		List<EventDto> eventsDto;

		java.lang.reflect.Type targetListType1 = new TypeToken<List<RelationshipDto>>() {
		}.getType();

		relacionesDto1 = mapper.map(relaciones1, targetListType1);
		relacionesDto2 = mapper.map(relaciones2, targetListType1);

		java.lang.reflect.Type targetListType2 = new TypeToken<List<ReactionDto>>() {
		}.getType();

		reaccionesDto = mapper.map(reacciones, targetListType2);

		java.lang.reflect.Type targetListType3 = new TypeToken<List<AssistanceDto>>() {
		}.getType();

		assistancesDto = mapper.map(assistances, targetListType3);

		java.lang.reflect.Type targetListType4 = new TypeToken<List<MessageDto>>() {
		}.getType();

		messagesDto = mapper.map(messages, targetListType4);

		java.lang.reflect.Type targetListType5 = new TypeToken<List<EventDto>>() {
		}.getType();

		eventsDto = mapper.map(events, targetListType5);

		fullUserDto fullUser = new fullUserDto(user.getId(), user.getName(), user.getSurname(), user.getBirthdate(),
				user.getStardate(), user.getUser(), user.getPass(), relacionesDto1, relacionesDto2, reaccionesDto,
				assistancesDto, messagesDto, eventsDto);
		return new ResponseEntity<>(fullUser, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, params = { "name", "surname", "birthdate", "stardate", "user",
			"pass" })
	public ResponseEntity<Void> createUser(@RequestParam(value = "name") String name,
			@RequestParam(value = "surname") String surname, @RequestParam(value = "birthdate") Date birthdate,
			@RequestParam(value = "stardate") Date stardate, @RequestParam(value = "user") String user,
			@RequestParam(value = "pass") String pass) {

		boolean bool = serviceUser.createUser(name, surname, birthdate, stardate, user, pass);

		if (bool) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}", params = { "surname" })
	public ResponseEntity<Void> modifySurname(@RequestParam(value = "surname") String surname,
			@PathVariable(value = "id") int id) {

		boolean bool = serviceUser.updateSurname(id, surname);

		if (bool) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login", params = { "user", "pass" })
	public ResponseEntity<UserDto> login(@RequestParam(value = "user") String user,
			@RequestParam(value = "pass") String pass) {

		User us = serviceUser.login(user, pass);
		UserDto usDto = new UserDto(us.getId(), us.getName(), us.getSurname(), us.getBirthdate(), us.getStardate(),
				us.getUser(), us.getPass());

		return new ResponseEntity<>(usDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}/relationship",params= {"id_user1","id_user2"})
	public ResponseEntity<Void> createRelationship(@PathVariable(value = "id") int id,
			@RequestParam(value = "id_user1") int id_user1,@RequestParam(value = "id_user2") int id_user2) {
		
		User user1 = serviceUser.findById(id_user1);
		User user2 = serviceUser.findById(id_user2);

		boolean bool = serviceRelationship.createRelationship("PENDING", user1, user2);

		if (bool) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/relationship/{id}")
	public ResponseEntity<Void> updateRelationship(@PathVariable(value = "id") int id) {

		boolean bool = serviceRelationship.updateRelationship(id);

		if (bool) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

}
