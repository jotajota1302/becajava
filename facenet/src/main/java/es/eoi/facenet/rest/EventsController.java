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

import es.eoi.facenet.dto.EventDto;
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
	public ResponseEntity<EventDto> findById(int id) {
		ModelMapper mapper = new ModelMapper();
		EventDto eventDto;
		Event events = eventservice.findById(id);
		java.lang.reflect.Type targetListType = new TypeToken<List<EventDto>>() {
		}.getType();
		eventDto = mapper.map(events, targetListType);
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

	@RequestMapping(method = RequestMethod.POST, value = "/{id}/notAssistance",params = "id_user")
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

//	@RequestMapping(method = RequestMethod.GET, value = "{id}/users/yesAssistance")
//	public ResponseEntity<List<AssistanceDto>> findByUsersYesAssistance() {
//		return null;
//	}
//	
//	@RequestMapping(method = RequestMethod.GET, value = "{id}/users/notAssistance")
//	public ResponseEntity<List<AssistanceDto>> findByUsersNotAssistance() {
//		return null;
//	}
//	
//	@RequestMapping(method = RequestMethod.GET, value = "user/{id}/yesAssistance")
//	public ResponseEntity<List<EventDto>> findByEventYesAssistance() {
//		return null;
//	}
//	
//	@RequestMapping(method = RequestMethod.GET, value = "user/{id}/notAssistance")
//	public ResponseEntity<List<EventDto>> findByEventNotAssistance() {
//		return null;
//	}

}
