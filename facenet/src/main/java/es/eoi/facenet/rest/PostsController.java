package es.eoi.facenet.rest;


import java.util.Date;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import es.eoi.facenet.entities.Post;
import es.eoi.facenet.services.PostService;

@RestController
//@RequestMapping(value = "/posts")
public class PostsController {

	@Autowired
	private PostService service;

	@RequestMapping(method = RequestMethod.POST, value = "/posts", params = {"content", "publishdate"})
		public Post savePost(
			@RequestParam(value = "content") String content,
			@RequestParam(value = "publishdate") Date publishdate){
				Post post = new Post();
				post.setContent(content);
				post.setPublishdate(publishdate);
				return service.save(post);
		}

		
		@RequestMapping(method = RequestMethod.GET, value="/posts/{id}/findid", params = {"id"})
		public Post findByIdPost(
		@PathParam(value = "id") int id){
				return service.findById(id);
		}
		
		
		@RequestMapping(method = RequestMethod.GET, value="/posts/{id}/existsid",params = {"id"})
		public boolean existsByIdPost(
		@PathParam(value = "id") int id) {
		if(service.existsById(id) == true) {
				return true;
			} else {
				return false;
			}
		}

		
		@RequestMapping(method = RequestMethod.DELETE, value="/posts/{id}/deleteid", params = {"id"})
		public void deletePostById(
				@PathParam(value = "id") int id) {
			service.deleteById(id);
		}
}