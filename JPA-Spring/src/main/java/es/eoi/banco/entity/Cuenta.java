package es.eoi.banco.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUENTAS")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true)
	private int id;

	@Column(name = "SALDO")
	private double saldo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dni", referencedColumnName = "DNI")
	private Cliente cliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDBANCO", referencedColumnName = "ID")
	private Banco banco;

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", saldo=" + saldo + ", cliente=" + cliente.getDni() + ", banco=" + banco.getNombre() + "]";
	}
	
	

}
