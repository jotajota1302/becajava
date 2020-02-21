package es.eoi.banco.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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

}
