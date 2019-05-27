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
import es.eoi.facenet.dto.FullEventDto;
import es.eoi.facenet.dto.UserDto;
import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.AssistanceService;
import es.eoi.facenet.services.EventService;
import es.eoi.facenet.services.UserService;

@RestController
@RequestMapping(value = "/events")
public class EventsController {
	@Autowired
	private EventService eventservice;

	@Autowired
	private AssistanceService assistanceservice;

	@Autowired
	public UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<EventDto>> findAll() {
		ModelMapper mapper = new ModelMapper();
		List<EventDto> eventDto;
		List<Event> events = eventservice.findAll();
		java.lang.reflect.Type targetListType = new TypeToken<List<EventDto>>() {
		}.getType();
		eventDto = mapper.map(events, targetListType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<FullEventDto> findById(@PathVariable(value="id")int id) {
		ModelMapper mapper = new ModelMapper();

		Event events = eventservice.findById(id);
		User user = events.getUser();
		UserDto userDto = new UserDto(user.getId(), user.getName(), user.getSurname(), user.getBirthdate(),
				user.getStardate(), user.getUser(), user.getPass());
		List<Assistance> asistencias = user.getAssistances();
		List<AssistanceDto> asistenciasDto;

		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {
		}.getType();

		asistenciasDto = mapper.map(asistencias, targetListType);

		FullEventDto eventDto = new FullEventDto(events.getId(), events.getName(), events.getDescription(),
				events.getEventDate(), userDto, asistenciasDto);

		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, params = { "name", "description", "eventDate", "id_user" })
	public ResponseEntity<Void> createEvent(@RequestParam(value = "name") String name,
			@RequestParam(value = "description") String description, @RequestParam(value = "eventDate") Date eventDate,
			@RequestParam(value = "id_user") int id_user) {
		User user = userService.findById(id_user);
		boolean bool = eventservice.createEvent(name, description, eventDate, user);
		if (bool) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}/yesAssistance", params = "id_user")
	public ResponseEntity<Void> createYesAssistance(@PathVariable(value = "id") int id,
			@RequestParam(value = "id_user") int id_user) {

		User user = userService.findById(id_user);
		Event event = eventservice.findById(id);
		boolean bool = assistanceservice.yesassist(event, user);

		if (bool) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}

	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}/notAssistance", params = "id_user")
	public ResponseEntity<Void> createNoAssistance(@PathVariable(value = "id") int id,
			@RequestParam(value = "id_user") int id_user) {

		User user = userService.findById(id_user);
		Event event = eventservice.findById(id);
		boolean bool = assistanceservice.notassist(event, user);

		if (bool) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}

	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}/users/yesAssistance")
	public ResponseEntity<List<UserDto>> findByUsersYesAssistance(@PathVariable(value="id")int id) {
		ModelMapper mapper = new ModelMapper();
		List<UserDto> userDto;
		List<User> user = assistanceservice.findByUsersYesAssistance(id);
		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {
		}.getType();
		userDto = mapper.map(user, targetListType);
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}/users/notAssistance")
	public ResponseEntity<List<UserDto>> findByUsersNotAssistance(@PathVariable(value="id")int id) {
		ModelMapper mapper = new ModelMapper();
		List<UserDto> userDto;
		List<User> user = assistanceservice.findByUsersNotAssistance(id);
		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {
		}.getType();
		userDto = mapper.map(user, targetListType);
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "user/{id}/yesAssistance")
	public ResponseEntity<List<EventDto>> findByEventYesAssistance(@PathVariable(value="id")int id) {
		ModelMapper mapper = new ModelMapper();
		List<EventDto> eventDto;
		List<Event> event = assistanceservice.findByEventYesAssistance(id);
		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {
		}.getType();
		eventDto = mapper.map(event, targetListType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "user/{id}/notAssistance")
	public ResponseEntity<List<EventDto>> findByEventNotAssistance(@PathVariable(value="id")int id) {
		ModelMapper mapper = new ModelMapper();
		List<EventDto> eventDto;
		List<Event> event = assistanceservice.findByEventNotAssistance(id);
		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {
		}.getType();
		eventDto = mapper.map(event, targetListType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}
}
