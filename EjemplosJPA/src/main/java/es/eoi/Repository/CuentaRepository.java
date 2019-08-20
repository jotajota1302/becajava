package es.eoi.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import es.eoi.entity.Banco;
import es.eoi.entity.Cliente;
import es.eoi.entity.Cuenta;

public class CuentaRepository {
	public EntityManager em;

	//CONDTRUCTOR
	public CuentaRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		em = emf.createEntityManager();
	}
	
	//METODO CREAR CUENTA
	public void createCuenta(Cliente cliente, Banco banco, double saldo ) {

		try {
			em.getTransaction().begin();
			Cuenta cuenta=new Cuenta();
			cuenta.setCliente(cliente);
			cuenta.setBanco(banco);
			cuenta.setSaldo(saldo);
			em.persist(cuenta);
			em.getTransaction().commit();
			System.out.println("Exito al crear cuenta");

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("error al crear cuenta");
		}

	}
	
	//METODO BUSCAR CUENTAS
	public List<Cuenta> findAllCuentas() {

		List<Cuenta> result = null;
		try {
			String hql = "FROM CUENTAS";
			Query query = em.createQuery(hql);
			result = query.getResultList();

		} catch (Exception e) {
			System.out.println("Error al buscar cuentas");
		}
		return result;
	}
	
	//METODO BUSCAR POR ID
	public Cuenta findById(int id) {

		Cuenta cuenta = null;
		try {

			cuenta = em.find(Cuenta.class, id);

		} catch (Exception e) {
			System.out.println("Error al buscar por id");
		}
		return cuenta;
	}
	
	//METODO MODIFICAR CUENTA
	public void updateCuenta(int id,double saldo) {

		try {
			Cuenta cuenta= findById(id);
			cuenta.setSaldo(saldo);
			em.getTransaction().begin();
			em.merge(cuenta);
			em.getTransaction().commit();
			System.out.println("Exito al modificar");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Error al modificar");
		}
	}
	
	//METODO BORRAR CUENTA
	public void removeCuenta(int id) {
		
		try {

			Cuenta cuenta = findById(id);
			em.getTransaction().begin();
			em.remove(cuenta);
			em.getTransaction().commit();
			System.out.println("Exito al borrar cuenta");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Error al borrar cuenta");
		}

	}
}
