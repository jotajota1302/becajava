package es.eoi.facenet.services;

import java.util.List;

import es.eoi.facenet.entities.Post;

public interface PostService {

	public Post save(Post post);
	
	public Post findById(int id);
	
	public void deleteById(int id);
	
	public List<Post> findAll();
}
