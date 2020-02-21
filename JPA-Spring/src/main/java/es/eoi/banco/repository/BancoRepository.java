package es.eoi.banco.repository;

import es.eoi.banco.entity.Banco;

public interface BancoRepository {

	boolean createBanco(Banco banco);

	Banco findById(int id);

	void removeBanco(int id);

	void updateBanco(int id, String nombre, String ciudad);

}