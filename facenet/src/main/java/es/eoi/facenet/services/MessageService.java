package es.eoi.facenet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Message;
import es.eoi.facenet.repositories.MessageRepository;

@Service
public class MessageService {

	@Autowired
	MessageRepository repository;

	public Message getMessageById(Integer id) {
		return this.repository.findById(id).get();
	}

	public Message updateMessage(Message message) {
		return this.repository.save(message);
	}

	public void deleteMessage(Message message) {
		this.repository.delete(message);
	}

}
