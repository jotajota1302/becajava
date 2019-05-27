package es.eoi.facenet;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import es.eoi.facenet.entities.Post;
import es.eoi.facenet.services.EventService;
import es.eoi.facenet.services.PostService;
import es.eoi.facenet.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacenetApplicationTests {

	@Autowired
	private PostService postService;
	
	@Autowired 
	private UserService userService;
	
	@Autowired
	private EventService eventService;
	
	@Test
	public void contextLoads() throws ParseException {
		
		Post post = new Post();
		
		String content = "Contenido del post";
		String date = "01/01/2000";
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
		Date publishdate = format.parse(date);
		
		post.setContent(content);
		post.setPublishdate(publishdate);
		
		System.out.println(postService.save(post));
		
	}

}
