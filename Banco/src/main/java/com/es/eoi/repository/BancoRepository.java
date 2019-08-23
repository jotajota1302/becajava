package com.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.eoi.entity.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Integer> {

}
