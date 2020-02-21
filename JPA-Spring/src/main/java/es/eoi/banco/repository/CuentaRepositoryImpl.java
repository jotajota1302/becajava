package es.eoi.banco.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.eoi.banco.EntityManagerBancoApp;
import es.eoi.banco.entity.Banco;
import es.eoi.banco.entity.Cliente;
import es.eoi.banco.entity.Cuenta;

@Repository
public class CuentaRepositoryImpl implements CuentaRepository {

	@Autowired
	EntityManagerBancoApp manager;

	@Override
	public void createCuenta(Cliente cliente, Banco banco, double saldo) {

		manager.getEm().getTransaction().begin();
		Cuenta cuenta = new Cuenta();
		cuenta.setCliente(cliente);
		cuenta.setBanco(banco);
		cuenta.setSaldo(saldo);
		manager.getEm().persist(cuenta);
		manager.getEm().getTransaction().commit();

	}

	public Cuenta findById(int id) {

		return manager.getEm().find(Cuenta.class, id);

	}

	public void updateCuenta(int id, double saldo) {

		Cuenta cuenta = findById(id);
		cuenta.setSaldo(saldo);
		manager.getEm().getTransaction().begin();
		manager.getEm().merge(cuenta);
		manager.getEm().getTransaction().commit();
	}

	public void removeCuenta(int id) {
		Cuenta cuenta = findById(id);
		manager.getEm().getTransaction().begin();
		manager.getEm().remove(cuenta);
		manager.getEm().getTransaction().commit();

	}
}
