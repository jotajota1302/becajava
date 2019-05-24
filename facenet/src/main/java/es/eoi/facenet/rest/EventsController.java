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

import es.eoi.facenet.dto.EventDto;
import es.eoi.facenet.entities.Event;
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
	
//	@RequestMapping(method = RequestMethod.GET, value = "/events/{id}")
//	public ResponseEntity<List<EventDto>> findById() {
//		ModelMapper mapper = new ModelMapper();
//		List<EventDto> eventDto;
//		List<Event> events = eventservice.findById(id);
//		java.lang.reflect.Type targetListType = new TypeToken<List<EventDto>>() {}.getType();
//		eventDto = mapper.map(events, targetListType);
//		return new ResponseEntity<>(eventDto, HttpStatus.OK);
//	}
//	
//	@RequestMapping(mehod = RequestMethod.POST)
//	public
}
