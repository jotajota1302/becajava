package es.eoi.redsocial.controller;

import java.util.Date;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.reflect.TypeToken;
import es.eoi.redsocial.dto.EventDto;
import es.eoi.redsocial.entities.Event;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.services.IEventService;



@RestController
@RequestMapping(value="/event")
public class EventsController {

	@Autowired
	IEventService eventService;
	
	//findById
	@RequestMapping(method = RequestMethod.GET, params= {"id"})
	public Event findEventById(
		@RequestParam(value= "id")int id) {
			return eventService.findById(id);		
		}
	

    // findAll
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<EventDto>> findAll(){
    	ModelMapper mapper =new ModelMapper();
    	List<EventDto> eventDto;
    	List<Event> event=eventService.findAll();
    	java.lang.reflect.Type targetListType= new TypeToken <List<EventDto>>() {}.getType();
    	eventDto = mapper.map(event, targetListType);
        return new ResponseEntity<>(eventDto, HttpStatus.OK);
    	
    }
    
    //create
	@RequestMapping(method=RequestMethod.POST,params= {"name","description","eventdate","iduser"})
	public Event create(
			@RequestParam(value="name")String name,
			@RequestParam(value="description")String description,
			@RequestParam(value="eventdate")Date eventdate,
			@RequestParam(value="iduser")User userObject) {
		return eventService.save(name, description, eventdate, userObject);
		
	}
}
