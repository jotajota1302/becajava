package es.eoi.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CLIENTES")
public class Cliente {
	@Id
	@Column(name = "DNI", unique = true)
	private String dni;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "DIRECCION")
	private String direccion;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Cuenta> cuentas;

	
	
	public Cliente(String dni, String nombre, String direccion, List<Cuenta> cuentas) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cuentas = cuentas;
	}



	public Cliente() {
	}



	@Override
	public String toString() {
		return "Cliente:\nDNI: " + dni + "\nNombre: " + nombre + "\nDireccion=" + direccion + "\nCuentas=" + cuentas + "";
	}
	
	

}
