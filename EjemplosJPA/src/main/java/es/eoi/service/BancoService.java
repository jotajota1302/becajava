package es.eoi.service;

import java.util.List;

import es.eoi.entity.Banco;
import es.eoi.repository.BancoRepository;

public class BancoService {

	BancoRepository bancoRepository = new BancoRepository();

	public void createBanco() {

		bancoRepository.createBanco();
	}

	public List<Banco> findAllBancos() {

		return bancoRepository.findAllBancos();
	}

	public Banco findById(int id) {
		return bancoRepository.findById(id);
	}

	public void updateBanco(int id, String nombre, String ciudad) {
		bancoRepository.updateBanco(id, nombre, ciudad);
	}

	public void removeBanco(int id) {
		bancoRepository.removeBanco(id);
	}
}
