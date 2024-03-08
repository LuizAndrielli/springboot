package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Pessoa findByName(String nome);
}
