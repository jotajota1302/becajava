package es.eoi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "BANCOS")
public class Banco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true)
	private int id;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "CIUDAD")
	private String ciudad;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "banco")
	private List<Cuenta> cuentas;

	public Banco(int id, String nombre, String ciudad, List<Cuenta> cuentas) {
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.cuentas = cuentas;
	}

	public Banco() {
	}

	@Override
	public String toString() {
		return "Banco:\nId:" + id + "\nNombre:" + nombre + "\nCiudad=" + ciudad + "\nCuentas=" + cuentas + "]";
	}

}
