package com.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.eoi.entity.Banco;
import com.es.eoi.repository.BancoRepository;

@Service
public class BancoService {

	@Autowired
	BancoRepository bancoRepository;

	public void save(Banco banco) {
		bancoRepository.save(banco);
	}

	public List<Banco> findAll() {
		return bancoRepository.findAll();
	}

	public Banco findById(int id) {
		return bancoRepository.findById(id).get();
	}

	public void remove(int id) {
		bancoRepository.deleteById(id);
		;
	}
}
