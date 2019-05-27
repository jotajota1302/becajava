package es.eoi.facenet.rest;

import java.util.Date;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import es.eoi.facenet.entities.Post;
import es.eoi.facenet.entities.User;
import es.eoi.facenet.services.PostService;
import es.eoi.facenet.services.UserService;

@Configuration
@RestController
public class PostsController {

	@Autowired
	private PostService postService;
	
	@Autowired 
	private UserService userService;

	//Save a post
	@RequestMapping(method = RequestMethod.POST, value = "/posts", params = {"content", "publishdate", "id_user"})
		public Post savePost(
			@RequestParam(value = "content") String content,
			@RequestParam(value = "publishdate") Date publishdate,
			@RequestParam(value = "id_user") int id_user){
				Post post = new Post();
				post.setContent(content);
				post.setPublishdate(publishdate = new Date());
				post.setUser(userService.findById(id_user));
				return postService.save(post);
		}
		
	//Find a post by id
	@RequestMapping(method = RequestMethod.GET, value="/posts/{id}")
	public Post findPostById(
			@PathVariable int id) {
		return postService.findById(id);
	}
	
	//Delete a post by id
	@RequestMapping(method = RequestMethod.DELETE, value="/posts/{id}")
	public void deletePostById(
			@PathVariable int id) {
		postService.deleteById(id);
	}
	
	//Return list of posts of a user
	@RequestMapping(method = RequestMethod.GET, value="/posts/users/{id}")
	public List<Post> returnListPost(
			@PathVariable int id){
		List<Post> posts = postService.findAll();
		User user = new User();
		
		user.setPosts(posts);
		
		return posts;
	}
}