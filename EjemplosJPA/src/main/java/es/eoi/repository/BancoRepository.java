package es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import es.eoi.entity.Banco;

public class BancoRepository {

	public EntityManager em;

	//CONSTRUCTOR
	public BancoRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		em = emf.createEntityManager();
	}

	//METODO CREAR BANCO
	public boolean createBanco() {

		try {
			em.getTransaction().begin();
			Banco banco = new Banco();
			banco.setNombre("Santander");
			banco.setCiudad("Alicante");
			em.persist(banco);
			em.getTransaction().commit();
			System.out.println("Exito al crear banco");

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("error al crear banco");
		}
		return true;

	}

	//METODO BUSCAR POR ID
	public Banco findById(int id) {

		Banco banco = null;
		try {

			banco = em.find(Banco.class, id);

		} catch (Exception e) {
			System.out.println("Error al buscar banco por id");
		}
		return banco;
	}

	//METODO BUSCAR BANCOS
	public List<Banco> findAllBancos() {

		List<Banco> result = null;
		try {
			String hql = "FROM BANCOS";
			Query query = em.createQuery(hql);
			result = query.getResultList();

		} catch (Exception e) {
			System.out.println("Error al buscar bancos");
		}
		return result;
	}

	//METODO BORRAR BANCO
	public void removeBanco(int id) {
		Banco banco;
		try {

			banco = findById(id);
			em.getTransaction().begin();
			em.remove(banco);
			em.getTransaction().commit();
			System.out.println("Exito al borrar banco");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Error al borrar banco");
		}

	}

	//METODO MODIFICAR BANCO
	public void updateBanco(int id, String nombre, String ciudad) {

		try {
			Banco banco = findById(id);
			banco.setNombre(nombre);
			banco.setCiudad(ciudad);
			em.getTransaction().begin();
			em.merge(banco);
			em.getTransaction().commit();
			System.out.println("Exito al modificar");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Error al modificar");
		}
	}


}
