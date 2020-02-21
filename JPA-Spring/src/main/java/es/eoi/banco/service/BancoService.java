package es.eoi.banco.service;

import es.eoi.banco.entity.Banco;

public interface BancoService {

	Banco findById(int id);

	void updateBanco(int id, String nombre, String ciudad);

	void removeBanco(int id);

	void createBanco(Banco banco);

}