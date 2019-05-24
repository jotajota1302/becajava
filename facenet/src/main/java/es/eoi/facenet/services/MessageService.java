package es.eoi.facenet.services;

import java.util.Date;
import java.util.List;

import es.eoi.facenet.entities.Message;
import es.eoi.facenet.entities.Reaction;
import es.eoi.facenet.entities.User;

public interface MessageService  {
	
	public Message findById(int id);
	public boolean createMessage(String content, Date publishdate, User user);
	public boolean deleteMessage(int id);
	public List<Message> findByUserId(int id);
	public List<Message> findByFriends(int id);


}