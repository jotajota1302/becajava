package es.eoi.redsocial;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "es.eoi.redsocial.repository")
@EntityScan( basePackages = {"es.eoi"} )
@ComponentScan(basePackages = "es.eoi")
@EnableAutoConfiguration
public class FacenetApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacenetApplication.class, args);
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("mysql:jdbc://localhost:3306/cursofrontendtarde?serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		return dataSource;
	}


}
