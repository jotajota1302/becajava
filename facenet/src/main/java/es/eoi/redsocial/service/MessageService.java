package es.eoi.redsocial.service;

import java.util.List;

import es.eoi.redsocial.entity.Message;

public interface MessageService {
 
	public Message findById(int id);
	
	public List<Message> findByUserId(int id);
	
	public Message createPost(Message message);
	
	public void deletePost(int id);
	
}
