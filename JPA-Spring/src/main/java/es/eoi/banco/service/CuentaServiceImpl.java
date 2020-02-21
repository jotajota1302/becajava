package es.eoi.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.banco.entity.Banco;
import es.eoi.banco.entity.Cliente;
import es.eoi.banco.entity.Cuenta;
import es.eoi.banco.repository.CuentaRepository;
import es.eoi.banco.repository.CuentaRepositoryImpl;

@Service
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	CuentaRepository cuentaRepository;

	public CuentaServiceImpl() {
		this.cuentaRepository = new CuentaRepositoryImpl();
	}

	public void createCuenta(Cliente cliente, Banco banco, double saldo) {
		cuentaRepository.createCuenta(cliente, banco, saldo);
	}

	public Cuenta findById(int id) {
		return cuentaRepository.findById(id);
	}

	public void updateCuenta(int id, double saldo) {
		cuentaRepository.updateCuenta(id, saldo);
	}

	public void removeCuenta(int id) {
		cuentaRepository.removeCuenta(id);
	}
}
