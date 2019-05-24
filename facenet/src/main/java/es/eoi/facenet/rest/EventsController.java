package es.eoi.facenet.rest;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.entities.Assist;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.services.EventService;

@Configuration
@RestController
public class EventsController {

	@Autowired
	private EventService service;

	@RequestMapping(method = RequestMethod.GET, value = "/events")
	public List<Event> findAll() {
		return service.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/events/{id}", params = { "id" })
	public Event findId(@PathParam(value = "id") int id) {
		return service.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/events", params = {"description", "event_date", "name"})
	public Event createEvent(
			@RequestParam(name = "description ") String description, 
			@RequestParam(name = "event_date") Date event_date,
			@RequestParam(name = "name") String name) {
		
		Event event = new Event();
		
		event.setDescription(description);
		event.setEventDate(event_date);
		event.setName(name);
		
		return service.createEvent(event);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/events/{id}/yesAssistance", params = {"id_user"})
	public boolean yesAssistance(
			@PathParam(value = "id_user") int id_user) {
		
		Assist assist = new Assist();
		assist.getId_assist();
		
		return true;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/events/{id}/notAssistance", params = {"id_user"})
	public boolean notAssistance(
			@PathParam(value = "id_user") int id_user) {
		
		Assist assist = new Assist();
		assist.getId_assist();
		
		return false;
	}
	
	/*@RequestMapping(method = RequestMethod.GET, value = "events/{id}/yesAssistance", params = {"id_user"})
	public List<Event> findYesAssistance(@PathParam(value = "id_user") int id_user){
		if(yesAssistance(id_user)) {
			service.findAll();
		}
		return service.findAll();
	}*/
}
