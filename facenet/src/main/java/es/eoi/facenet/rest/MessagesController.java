package es.eoi.facenet.rest;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.dto.MessageDto;
import es.eoi.facenet.dto.ReactionDto;
import es.eoi.facenet.dto.UserDto;
import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.MessageService;
import es.eoi.facenet.services.ReactionService;
import es.eoi.facenet.services.UserService;

@RestController
@RequestMapping(value = "/messages")
public class MessagesController {
	@Autowired
	private MessageService serviceMessage;

	@Autowired
	private ReactionService serviceReaction;

	@Autowired
	private UserService serviceUser;

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<MessageDto> findMessage(@PathVariable(value = "id") int id) {
		ModelMapper mapper = new ModelMapper();
		Message mess = serviceMessage.findById(id);
		List<Reaction> reactions = mess.getReactions();
		List<ReactionDto> reactionsDto;
		java.lang.reflect.Type targetListType = new TypeToken<List<ReactionDto>>() {
		}.getType();
		reactionsDto = mapper.map(reactions, targetListType);
		User user = mess.getUser();
		UserDto usDto = new UserDto(user.getId(), user.getName(), user.getSurname(), user.getBirthdate(),
				user.getStardate(), user.getUser(), user.getPass());
		MessageDto messDto = new MessageDto(mess.getId(), mess.getContent(), mess.getPublishdate(), usDto,
				reactionsDto);
		return new ResponseEntity<>(messDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
	public ResponseEntity<List<MessageDto>> findByIdUser(@PathVariable(value = "id") int id) {
		ModelMapper mapper = new ModelMapper();
		List<Message> messages = serviceMessage.findByUserId(id);
		List<MessageDto> messagesDto;
		java.lang.reflect.Type targetListType = new TypeToken<List<MessageDto>>() {
		}.getType();
		messagesDto = mapper.map(messages, targetListType);
		return new ResponseEntity<>(messagesDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}/friendPost")
	public ResponseEntity<List<MessageDto>> findFriendMessage(@PathVariable(value = "id") int id) {
		ModelMapper mapper = new ModelMapper();
		List<Message> messages = serviceMessage.findByFriends(id);
		List<MessageDto> messagesDto;
		java.lang.reflect.Type targetListType = new TypeToken<List<MessageDto>>() {
		}.getType();
		messagesDto = mapper.map(messages, targetListType);
		return new ResponseEntity<>(messagesDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, params = { "content", "publishdate", "id_user" })
	public ResponseEntity<Void> createMessage(@RequestParam(value = "content") String content,
			@RequestParam(value = "publishdate") Date publishdate, @RequestParam(value = "id_user") int id_user) {

		User user = serviceUser.findById(id_user);
		if (serviceMessage.createMessage(content, publishdate, user)) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}

	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}/reactions")
	public ResponseEntity<List<ReactionDto>> findReactionsId(@RequestParam(value = "id") int id) {
		ModelMapper mapper = new ModelMapper();
		List<Reaction> listaReaction = serviceReaction.reactionList(id);
		List<ReactionDto> listaDtos;
		java.lang.reflect.Type targetListType = new TypeToken<List<ReactionDto>>() {
		}.getType();
		listaDtos = mapper.map(listaReaction, targetListType);
		return new ResponseEntity<>(listaDtos, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public ResponseEntity<Void> deleteMessage(@RequestParam(value = "id") int id) {

		boolean bool = serviceMessage.deleteMessage(id);

		if (bool == true) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}/reactions", params = { "reactiontype", "id_user" })
	public ResponseEntity<Void> createReaction(@RequestParam(value = "id") int id,
			@RequestParam(value = "reactionType") String reactiontype, @RequestParam("id_user") int id_user) {
		Message mess = serviceMessage.findById(id);
		User us = serviceUser.findById(id_user);

		boolean bool = serviceReaction.createReaction(reactiontype, us, mess);

		if (bool == true) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

}
