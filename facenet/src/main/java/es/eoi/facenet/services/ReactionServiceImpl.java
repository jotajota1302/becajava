package es.eoi.facenet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.repositories.ReactionRepository;



@Service
public class ReactionServiceImpl implements ReactionService {

	@Autowired
	private ReactionRepository repository;
	

}