package com.es.eoi.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.eoi.dto.BancoDto;
import com.es.eoi.entity.Banco;
import com.es.eoi.service.BancoService;

@RestController
public class BancoRestController {

	@Autowired
	BancoService service;	
	
	@GetMapping("/banco/{id}")
	public Banco findBanco(@PathVariable String id) {
		return service.findById(Integer.parseInt(id));
	}

	@PostMapping("/banco")
	public void updateBanco(@RequestBody BancoDto banco) {
		Banco entity = new Banco();  
		BeanUtils.copyProperties(banco,entity);

		service.save(entity);
	}

	@DeleteMapping("/banco/{id}")
	public void deleteBanco(@PathVariable String id) {
		service.remove(Integer.parseInt(id));
	}

	@GetMapping("/banco/all")
	public List<Banco> findAll() {
		return service.findAll();
	}

}