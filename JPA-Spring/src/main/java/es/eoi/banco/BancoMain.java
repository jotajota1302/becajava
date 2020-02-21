package es.eoi.banco;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.eoi.banco.service.BancoService;
import es.eoi.banco.service.ClienteService;
import es.eoi.banco.service.CuentaService;

public class BancoMain {
	
	public static ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	
	public static Logger logger=Logger.getLogger(BancoMain.class);
	
	public static void main(String[] args) {	
		

		ClienteService clienteService = context.getBean(ClienteService.class);
		BancoService bancoService = context.getBean(BancoService.class);
		CuentaService cuentaService = context.getBean(CuentaService.class);


		logger.info(clienteService.findByDni("03765983S"));
		logger.info(bancoService.findById(1));
		logger.info(cuentaService.findById(1));		
		
	
		
	}

}
