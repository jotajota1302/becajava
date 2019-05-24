package es.eoi.facenet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import es.eoi.facenet.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
