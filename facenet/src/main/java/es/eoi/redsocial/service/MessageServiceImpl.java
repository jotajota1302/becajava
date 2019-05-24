package es.eoi.redsocial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.entity.Message;
import es.eoi.redsocial.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageRepository messageRepository;
	
	@Override
	public Message findById(int id) {
		return messageRepository.getOne(id);
	}

	@Override
	public List<Message> findByUserId(int id) {
		// TODO query personalizada
		return null; 
	}

	@Override
	public Message createPost(Message message) {
		return messageRepository.save(message);
	}

	@Override
	public void deletePost(int id) {
		messageRepository.deleteById(id);
	}

}
