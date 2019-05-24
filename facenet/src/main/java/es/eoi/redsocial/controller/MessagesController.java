package es.eoi.redsocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.redsocial.entity.User;
import es.eoi.redsocial.service.MessageService;

@RestController
public class MessagesController {

	@Autowired
	MessageService service;



}
