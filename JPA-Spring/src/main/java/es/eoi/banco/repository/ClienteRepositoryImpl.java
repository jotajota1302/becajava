package es.eoi.banco.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.eoi.banco.EntityManagerBancoApp;
import es.eoi.banco.entity.Cliente;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

	Logger logger = Logger.getLogger(ClienteRepositoryImpl.class);

	@Autowired
	public EntityManagerBancoApp manager;

	public void createClient(Cliente cliente) {

		logger.debug("Entro en createClient con parametros" + cliente.getDni());

		manager.getEm().getTransaction().begin();
		manager.getEm().persist(cliente);
		manager.getEm().getTransaction().commit();

		logger.debug("Salgo en createClient con parametros" + cliente.getDni());

	}
	
	public Cliente findByDni(String dni) {

		logger.debug("Entro en findByDni con parametros " + dni);

		return manager.getEm().find(Cliente.class, dni);
	}

	public void updateClient(String dni, String nombre, String direccion) {

		Cliente cliente = findByDni(dni);
		cliente.setNombre(nombre);
		cliente.setDireccion(direccion);

		manager.getEm().getTransaction().begin();
		manager.getEm().merge(cliente);
		manager.getEm().getTransaction().commit();

	}

	public void removeClient(String dni) {

		Cliente cliente = findByDni(dni);

		manager.getEm().getTransaction().begin();
		manager.getEm().remove(cliente);
		manager.getEm().getTransaction().commit();

	}

}
