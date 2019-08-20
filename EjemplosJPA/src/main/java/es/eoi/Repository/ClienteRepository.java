package es.eoi.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import es.eoi.entity.Cliente;

public class ClienteRepository {
	public EntityManager em;

	//CONSTRUCTOR
	public ClienteRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		em = emf.createEntityManager();
	}

	//METODO CREAR CLIENTE
	public void createClient() {

		try {
			em.getTransaction().begin();
			Cliente cliente = new Cliente();
			cliente.setNombre("juan");
			cliente.setDireccion("jdfgdsh");
			cliente.setDni("03765983S");
			em.persist(cliente);
			em.getTransaction().commit();
			System.out.println("Exito al crear cliente");

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("error al crear cliente");
		}

	}

	//METODO BUSCAR CLIENTES
	public List<Cliente> findAllClientes() {

		List<Cliente> result = null;
		try {
			String hql = "FROM CLIENTES";
			Query query = em.createQuery(hql);
			result = query.getResultList();

		} catch (Exception e) {
			System.out.println("Error al buscar clientes");
		}
		return result;
	}

	//METODO BUSCAR POR DNI
	public Cliente findByDni(String dni) {

		Cliente cliente = null;
		try {

			cliente = em.find(Cliente.class, dni);

		} catch (Exception e) {
			System.out.println("Error al buscar por dni");
		}
		return cliente;
	}

	//METODO MODIFICAR CLIENTE
	public void updateClient(String dni, String nombre, String direccion) {

		try {
			Cliente cliente = findByDni(dni);
			cliente.setNombre(nombre);
			cliente.setDireccion(direccion);
			em.getTransaction().begin();
			em.merge(cliente);
			em.getTransaction().commit();
			System.out.println("Exito al modificar");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Error al modificar");
		}
	}

	//METODO BORRAR CLIENTE
	public void removeClient(String dni) {
		Cliente cliente;
		try {

			cliente = findByDni(dni);
			em.getTransaction().begin();
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Exito al borrar cliente");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Error al borrar cliente");
		}

	}

}
