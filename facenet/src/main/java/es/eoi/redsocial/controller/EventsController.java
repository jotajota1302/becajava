package es.eoi.redsocial.controller;

import java.util.Date;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.reflect.TypeToken;
import es.eoi.redsocial.dto.EventDto;
import es.eoi.redsocial.entities.Assistance;
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.services.IAssistanceService;
import es.eoi.redsocial.services.IEventService;

@RestController
@RequestMapping(value = "/events")
public class EventsController {

	@Autowired
	IEventService eventService;
	@Autowired
	IAssistanceService assistService;

	// findById
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<EventDto> findById(@PathVariable int id) {
		ModelMapper model = new ModelMapper();
		EventDto eventDto;
		Event event = eventService.findById(id);
		java.lang.reflect.Type targetType = new TypeToken<EventDto>() {
		}.getType();
		eventDto = model.map(event, targetType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}

	// findAll
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<EventDto>> findAll() {
		ModelMapper mapper = new ModelMapper();
		List<EventDto> eventDto;
		List<Event> event = eventService.findAll();
		java.lang.reflect.Type targetListType = new TypeToken<List<EventDto>>() {
		}.getType();
		eventDto = mapper.map(event, targetListType);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);

	}

	// create
	@RequestMapping(method = RequestMethod.POST, params = { "name", "description", "eventdate", "iduser" })
	public Event create(@RequestParam(value = "name") String name,
			@RequestParam(value = "description") String description,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date eventdate,
			@RequestParam(value = "iduser") User userObject) {
		return eventService.save(name, description, eventdate, userObject);
	}

	// create eventAssistance
	@RequestMapping(method = RequestMethod.POST, params = { "iduser", "idevent","state" }, value = "/{id}/{YesAssistance}")
	public Assistance create(
			@RequestParam(value = "iduser") User userObject,
			@RequestParam(value = "idevent") Event eventObject,
			@RequestParam(value = "state") int state) {
		return assistService.save(userObject, eventObject, state);
	}
	
	
}
