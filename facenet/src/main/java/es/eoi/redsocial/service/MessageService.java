package es.eoi.redsocial.service;

import java.util.Date;
import java.util.List;

import es.eoi.redsocial.entity.Message;
import es.eoi.redsocial.repository.MessageRepository;

public interface MessageService {
 
	public Message findById(int id);
	public List<Message> findByUserId(int id);
	public Message createPost(String content);
	public void deletePost(int id);
	
	
}
