package es.eoi.service;

import java.util.List;

import es.eoi.entity.Banco;
import es.eoi.entity.Cliente;
import es.eoi.entity.Cuenta;
import es.eoi.repository.CuentaRepository;

public class CuentaService {

	CuentaRepository cuentaRepository;
	
	public CuentaService() {
		this.cuentaRepository= new CuentaRepository();
	}
	
	public void createCuenta(Cliente cliente, Banco banco, double saldo ) {
		cuentaRepository.createCuenta(cliente, banco, saldo);
	}
	public List<Cuenta> findAllCuentas() {

		return cuentaRepository.findAllCuentas();
	}

	public Cuenta findById(int id) {
		return cuentaRepository.findById(id);
	}

	public void updateCuenta(int id,double saldo) {
		cuentaRepository.updateCuenta(id, saldo);
	}

	public void removeCuenta(int id) {
		cuentaRepository.removeCuenta(id);
	}
}
