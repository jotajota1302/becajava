package es.eoi.facenet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.Post;
import es.eoi.facenet.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService{

	@Autowired 
	private PostRepository repository;

	@Override
	public Post save(Post post) {
		return repository.save(post);
	}

	@Override
	public Post findById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Post> findAll() {
		return repository.findAll();
	}
	
	
}
