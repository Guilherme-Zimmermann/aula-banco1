package com.aula_banco1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula_banco1.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Integer> {
}
