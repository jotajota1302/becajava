package es.eoi.facenet.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.entities.Assist;
import es.eoi.facenet.entities.Event;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.EventService;
import es.eoi.facenet.services.UserService;

@Configuration
@RestController
public class EventsController {

	@Autowired
	EventService eventService;
	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/events")
	public List<Event> findAll() {
		return eventService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/events/{id}", params = { "id" })
	public Event findId(@PathParam(value = "id") int id) {
		return eventService.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/events", params = {"description", "eventdate", "name", "id_user"})
	public Event createEvent(
			@RequestParam(value = "description") String description, 
			@RequestParam(value = "eventdate") Date eventdate,
			@RequestParam(value = "name") String name,
			@RequestParam(value = "id_user") int id_user){
		
		Event event = new Event();
		
		event.setDescription(description);
		event.setEventDate(eventdate);
		event.setName(name);
		event.setUser(userService.findById(id_user));
		
		return eventService.createEvent(event);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/events/{id_user}/yesAssistance", params = {"id_user"})
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
	
	@RequestMapping(method = RequestMethod.GET, value = "events/{id}/users/yesAssistance", params = {"id_user"})
	public List<Assist> findYesAssistance(@PathParam(value = "id_user") int id_user){
		
		List<Integer> yesAssistants = new ArrayList<Integer>();
		
		if(yesAssistance(id_user)) {
			yesAssistants.add(id_user);
		}
		return findYesAssistance(id_user);
	}

	@RequestMapping(method = RequestMethod.GET, value = "events/{id}/users/notAssistance", params = {"id_user"})
	 public List<Assist> findNotAssistance(@PathParam(value = "id_user") int id_user){
		
		List<Integer> notAssistants = new ArrayList<Integer>();
		
	 if(notAssistance(id_user)){
		 notAssistants.add(id_user);
	 	}
	 	return findNotAssistance(id_user);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "events/user/{id}/yesAssistence", params = {"id_user"})
	public List<User> findNotAssistUser(@PathParam(value = "id_user") int id_user){
		
		List<Integer> yesAssistEventsUser = new ArrayList<Integer>();
		
		if(yesAssistance(id_user)){
			yesAssistEventsUser.add(id_user);
		}
		
		return findNotAssistUser(id_user);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "events/user/{id}/notAssistance", params = {"id_user"})
	public List<User> notAssistEventsUser(@PathParam(value = "id_user")int id_user){
		
		List<Integer> notAssistEventsUser = new ArrayList<Integer>();
		
		 if(notAssistance(id_user)){
			 notAssistEventsUser.add(id_user);
		 	}
		 return findNotAssistUser(id_user);
	}
}
