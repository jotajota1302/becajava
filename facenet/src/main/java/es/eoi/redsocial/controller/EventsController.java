package es.eoi.redsocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.redsocial.service.EventService;

@RestController
public class EventsController {
	
	@Autowired
	EventService eventService;
	
	

}
