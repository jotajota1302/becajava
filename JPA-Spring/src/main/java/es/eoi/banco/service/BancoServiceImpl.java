package es.eoi.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.banco.entity.Banco;
import es.eoi.banco.repository.BancoRepository;

@Service
public class BancoServiceImpl implements BancoService {

	@Autowired
	BancoRepository bancoRepository;
	
	public Banco findById(int id) {
		return bancoRepository.findById(id);
	}

	public void updateBanco(int id, String nombre, String ciudad) {
		bancoRepository.updateBanco(id, nombre, ciudad);
	}

	public void removeBanco(int id) {
		bancoRepository.removeBanco(id);
	}

	@Override
	public void createBanco(Banco banco) {
		bancoRepository.createBanco(banco);
		
	}
}
