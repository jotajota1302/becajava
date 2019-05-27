package es.eoi.facenet.rest;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.dto.AssistanceDto;
import es.eoi.facenet.dto.EventDto;
import es.eoi.facenet.dto.UserDto;
import es.eoi.facenet.entities.Assistance;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.AssistanceService;
import es.eoi.facenet.services.EventService;

@RestController
@RequestMapping(value = "/events")
public class EventsController {
	@Autowired
	private EventService eventservice;

	@Autowired
	private AssistanceService assistanceservice;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<EventDto>> findAll() {
		ModelMapper mapper = new ModelMapper();
		List<EventDto> eventDto;
		List<Event> events = eventservice.findAll();
		java.lang.reflect.Type targetListType = new TypeToken<List<EventDto>>() {}.getType();
		eventDto = mapper.map(events, targetListType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<EventDto> findById(int id) {
		ModelMapper mapper = new ModelMapper();
		EventDto eventDto;
		Event events = eventservice.findById(id);
		java.lang.reflect.Type targetListType = new TypeToken<List<EventDto>>() {}.getType();
		eventDto = mapper.map(events, targetListType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	public 
	
//	@RequestMapping(method = RequestMethod.POST, value = "/{id}/yesAssistance")
//	public 

//	@RequestMapping(method = RequestMethod.POST, value = "/{id}/notAssistance")
//	public
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}/users/yesAssistance")
	public ResponseEntity<List<UserDto>> findByUsersYesAssistance() {
		ModelMapper mapper = new ModelMapper();
		List<UserDto> userDto;
		List<User> user = assistanceservice.findByUsersYesAssistance();
		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {}.getType();
		userDto = mapper.map(user, targetListType);
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}/users/notAssistance")
	public ResponseEntity<List<UserDto>> findByUsersNotAssistance() {
		ModelMapper mapper = new ModelMapper();
		List<UserDto> userDto;
		List<User> user = assistanceservice.findByUsersNotAssistance();
		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {}.getType();
		userDto = mapper.map(user, targetListType);
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "user/{id}/yesAssistance")
	public ResponseEntity<List<EventDto>> findByEventYesAssistance() {
		ModelMapper mapper = new ModelMapper();
		List<EventDto> eventDto;
		List<Event> event = assistanceservice.findByEventYesAssistance();
		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {}.getType();
		eventDto = mapper.map(event, targetListType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "user/{id}/notAssistance")
	public ResponseEntity<List<EventDto>> findByEventNotAssistance() {
		ModelMapper mapper = new ModelMapper();
		List<EventDto> eventDto;
		List<Event> event = assistanceservice.findByEventNotAssistance();
		java.lang.reflect.Type targetListType = new TypeToken<List<AssistanceDto>>() {}.getType();
		eventDto = mapper.map(event, targetListType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}
}
