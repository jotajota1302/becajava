package com.es.eoi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:application.properties")
public class BancoControllerIT {

	@LocalServerPort
	int randomServerPort;
	
	final String baseUrl = "http://localhost:8080/banco/";

	@Test
	public void getBanco_IdAsParam_BancoReturned() {

		TestRestTemplate testRestTemplate = new TestRestTemplate();

		ResponseEntity<String> response = testRestTemplate.getForEntity(baseUrl + "1", String.class);
		assertEquals(response.getStatusCode(), HttpStatus.OK);

	}

}
