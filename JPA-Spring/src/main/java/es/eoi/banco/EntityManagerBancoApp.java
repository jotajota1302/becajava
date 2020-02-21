package es.eoi.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class EntityManagerBancoApp {
	
	private EntityManager em;

	public EntityManagerBancoApp() {		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		em = emf.createEntityManager();
	}
	

}
