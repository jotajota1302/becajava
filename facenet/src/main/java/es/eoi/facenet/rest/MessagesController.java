package es.eoi.facenet.rest;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import es.eoi.facenet.dto.MessageDto;
import es.eoi.facenet.dto.ReactionDto;
import es.eoi.facenet.dto.UserDto;
import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.MessageService;
import es.eoi.facenet.services.ReactionService;

@RestController
@RequestMapping(value = "/messages")
public class MessagesController {
	@Autowired
	private MessageService serviceMessage;
	
	@Autowired
	private ReactionService serviceReaction;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<MessageDto> findById(@PathVariable(value = "id") int id) {
		ModelMapper mapper = new ModelMapper();
		Message mess = serviceMessage.findById(id);
		List<Reaction> reactions = mess.getReactions();
		List<ReactionDto> reactionsDto;
		java.lang.reflect.Type targetListType = new TypeToken<List<ReactionDto>>() {
		}.getType();
		reactionsDto = mapper.map(reactions, targetListType);
		User user = mess.getUser();
		UserDto usDto = new UserDto(user.getId(),user.getName(),user.getSurname(),user.getBirthdate(),user.getStardate(),user.getUser(),user.getPass());
		MessageDto messDto = new MessageDto(mess.getId(), mess.getContent(), mess.getPublishdate(), usDto, reactionsDto);
		return new ResponseEntity<>(messDto, HttpStatus.OK);
	}
	
	
	
	
	
}
