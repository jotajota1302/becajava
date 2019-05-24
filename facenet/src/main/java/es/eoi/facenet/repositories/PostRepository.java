package es.eoi.facenet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.facenet.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

	@Override
	default List<Post> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
