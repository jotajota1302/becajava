package es.eoi.facenet.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.services.MessageService;

@RestController
@RequestMapping(value = "")
public class MessagesController {
	@Autowired
	private MessageService serviceMessage;
}
