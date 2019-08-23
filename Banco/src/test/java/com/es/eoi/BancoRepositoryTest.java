package com.es.eoi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.es.eoi.entity.Banco;
import com.es.eoi.repository.BancoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@TestPropertySource("classpath:application.properties")
public class BancoRepositoryTest {

	@Autowired
	BancoRepository repository;

	@Test	
	public void testCreate() {
		Banco banco = new Banco();
		banco.setNombre("TEST_BANK");
		banco.setCiudad("TEST_CITY");
		assertNotNull(this.repository.save(banco));
	}


}
