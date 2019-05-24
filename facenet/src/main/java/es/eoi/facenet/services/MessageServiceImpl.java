package es.eoi.facenet.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageRepository repositoryMessage;

	@Override
	public Message findById(int id) {
		return repositoryMessage.findById(id).get();
	}

	@Override
	public boolean createMessage(String content, Date publishdate, User user) {
		Message mess = new Message(content, publishdate, user);
		if (repositoryMessage.saveAndFlush(mess) != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteMessage(int id) {

		repositoryMessage.deleteById(id);
		repositoryMessage.flush();
		Message mess = repositoryMessage.findById(id).get();
		if(mess!=null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public List<Message> findByUserId(int id) {
		return repositoryMessage.findByUserId(id);
	}

	@Override
	public List<Message> findByFriends(int id) {
		return repositoryMessage.findByFriend(id);
	}


}