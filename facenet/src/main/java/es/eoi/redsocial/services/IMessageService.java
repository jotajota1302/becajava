package es.eoi.redsocial.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import es.eoi.redsocial.entities.Message;
import es.eoi.redsocial.entities.User;

@Service
public interface IMessageService {
	public List<Message> findAll();
	public void deleteById(int id);
	public Message findById(int id);
	public Message save(int id, String content, Date publisDate, User userObject);
}
