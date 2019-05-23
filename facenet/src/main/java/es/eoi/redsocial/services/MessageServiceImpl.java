package es.eoi.redsocial.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.entities.Message;
import es.eoi.redsocial.entities.User;
import es.eoi.redsocial.repositories.IMessageRepository;

@Service
public class MessageServiceImpl implements IMessageService {
	@Autowired
	private IMessageRepository messageRepo;

	@Override
	public List<Message> findAll() {
		return messageRepo.findAll();
	}

	@Override
	public void deleteById(int id) {
		try {
			messageRepo.deleteById(id);
			System.out.println("Borrado");
		} catch (Exception e) {
			System.out.println("No borrado");
		}

	}

	@Override
	public Message findById(int id) {
		return messageRepo.findById(id).get();

	}

	@Override
	public Message save(int id, String content, Date publishDate, User userObject) {
		Message m = new Message(id,content,publishDate, userObject);
		return messageRepo.save(m);
	}

}
