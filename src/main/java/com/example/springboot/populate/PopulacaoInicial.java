package com.example.springboot.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.entities.Pessoa;
import com.example.springboot.repositories.PessoaRepository;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class PopulacaoInicial implements CommandLineRunner {

	@Autowired
	PessoaRepository repo;

	@Override
	public void run(String... args) throws Exception {

		Pessoa p1 = new Pessoa();
		p1.setIdade(35);
		p1.setName("Guto");
		
		Pessoa p2 = new Pessoa();
		p2.setIdade(2);
		p2.setName("Teste");

		repo.save(p1);
		repo.save(p2);

	}

}
