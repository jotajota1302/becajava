package es.eoi.rest;

import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD

import es.eoi.redsocial.entity.TestEntity;
import es.eoi.services.EntityServiceImpl;
=======
>>>>>>> bflorez
 
@RestController
public class EntityRestController {
 
<<<<<<< HEAD
	@Autowired
	EntityServiceImpl service;
	
    @GetMapping("/entities/{id}")
    public TestEntity message(@PathVariable String id) {   
    	return service.getEntityById(Integer.parseInt(id));
    }
}
=======
}
>>>>>>> bflorez
