package es.eoi.app;

import java.util.Scanner;

import es.eoi.entity.Banco;
import es.eoi.entity.Cliente;
import es.eoi.service.BancoService;
import es.eoi.service.ClienteService;
import es.eoi.service.CuentaService;

public class MundoBancario {

	public static void main(String[] args) {

		ClienteService clienteService = new ClienteService();
		BancoService bancoService = new BancoService();
		CuentaService cuentaService = new CuentaService();

		//////////// CLIENTES ///////////////
		
//		Cliente cliente=clienteService.findByDni("03765983S");
//		System.out.println(cliente);
		
		// FUNCIONA
//		 clienteService.createClient();

		//NO FUNCIONA
		// System.out.println(clienteService.findAllClientes().toString());

		// FUNCIONA
//		 System.out.println(clienteService.findByDni("03765983S"));

		// FUNCIONA
		// clienteService.removeClient("53763892D");

		// FUNCIONA
		 clienteService.updateClient("03765983S", "Ramon", "C/San sebastian");

		///////////// BANCOS ///////////
		// FUNCIONA
//		 bancoService.createBanco();

		// FUNCIONA
		// System.out.println(bancoService.findById(1));

		//NO FUNCIONA
		//System.out.println(bancoService.findAllBancos().toString());

		// FUNCIONA
		// bancoService.removeBanco(2);

		// FUNCIONA
		// bancoService.updateBanco(3, "Kaixa", "Madrid");

		////////// CUENTAS //////////

		// FUNCIONA
		
//		 Cliente cliente= clienteService.findByDni("03765983S");
//		 Banco banco=bancoService.findById(2);		
//		 cuentaService.createCuenta(cliente,banco, 5000.0);

		// FUNCIONA
		// System.out.println(cuentaService.findById(1));

		// System.out.println(cuentaService.findAllCuentas().toString());

		// FUNCIONA
		// cuentaService.removeCuenta(2);

		// FUNCIONA
		// cuentaService.updateCuenta(3, 1300);
	}

	public static void printMainMenu() {

		System.out.println("CLIENTES-BANCOS");
		System.out.println("1 –Crear 5 Clientes ");
		System.out.println("2 –Crear 5 Bancos ");
		System.out.println("3 –Recuperar Cliente por su Clave Principal ");
		System.out.println("4 –Recuperar Banco por su Clave Principal ");
		System.out.println("5 –Modificar Cliente ");
		System.out.println("6 –Modificaremos un Banco");
		System.out.println("7 –Eliminar Cliente");
		System.out.println("8 –Eliminar Banco");
		System.out.println("9 –Obtener lista de todos los clientes.");
		System.out.println("10 –Obtener lista de todos los bancos. ");
		System.out.println("11 –Crear 5 cuentas (Habrán clientes con varias cuentas) ");
		System.out.println("12 –Modificaremos cuentas");
		System.out.println("13 –Eliminar cuentas");
		System.out.println("14 –Obtener cuentas por banco");
		System.out.println("15 –Obtener cuentas por cliente");
		System.out.println("16 –Obtendremos un listado de todos los clientes y sus cuentas (tengan cuenta o no)");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

		switch (option) {
		case 1:

			break;
		case 2:
			// service.findByDni(dni);
			break;
		case 3:
			// service.create(alumno);
			break;
		case 4:
			// service.update(dni, nombre, apellidos);
			break;
		case 5:
			// service.delete(dni);
			break;
		case 6:
			System.exit(0);
			break;

		default:
			break;
		}
		// printMainMenu();
		scanner.close();
	}

}
