package es.eoi.banco.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.eoi.banco.EntityManagerBancoApp;
import es.eoi.banco.entity.Banco;

@Component
public class BancoRepositoryImpl implements BancoRepository  {

	@Autowired
	public EntityManagerBancoApp manager;

	@Override
	public boolean createBanco(Banco banco) {

		manager.getEm().getTransaction().begin();
		manager.getEm().persist(banco);
		manager.getEm().getTransaction().commit();

		return true;

	}

	@Override
	public Banco findById(int id) {
		return manager.getEm().find(Banco.class, id);
	}

	@Override
	public void removeBanco(int id) {
		Banco banco = findById(id);
		manager.getEm().getTransaction().begin();
		manager.getEm().remove(banco);
		manager.getEm().getTransaction().commit();
	}

	@Override
	public void updateBanco(int id, String nombre, String ciudad) {

		Banco banco = findById(id);
		banco.setNombre(nombre);
		banco.setCiudad(ciudad);

		manager.getEm().getTransaction().begin();
		manager.getEm().merge(banco);
		manager.getEm().getTransaction().commit();
	}

}
