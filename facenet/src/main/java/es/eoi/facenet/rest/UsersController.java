package es.eoi.facenet.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
	@Autowired
	private UserService serviceUser;
}
