package com.aula_banco1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula_banco1.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
