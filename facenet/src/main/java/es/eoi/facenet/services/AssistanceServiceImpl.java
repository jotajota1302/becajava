package es.eoi.facenet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.repositories.AssistanceRepository;

@Service
public class AssistanceServiceImpl implements AssistanceService {

	@Autowired
	private AssistanceRepository repository;
}
	





