package com.example.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springboot.entities.Pessoa;
import com.example.springboot.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository repo;

	public List<Pessoa> findAll() {
		return repo.findAll();
	}

	public Optional<Pessoa> findById(@PathVariable Long id) {
		return repo.findById(id);
	}

	public Pessoa findByName(String name) {
		return repo.findByName(name);
	}

	public Pessoa salvarPessoa(Pessoa obj) {
		return repo.save(obj);
	}

	public Pessoa update(Pessoa pessoa) {
		Pessoa pessoaExistente = repo.findById(pessoa.getId()).orElse(null);
		pessoaExistente.setName(pessoa.getName());
		pessoaExistente.setIdade(pessoa.getIdade());
		return repo.save(pessoaExistente);
	}
	
	public String deletePessoaPorId(Long id) {
		repo.deleteById(id);
		return "Pessoa deletada id = "+id;
	}

}
