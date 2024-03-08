package com.example.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entities.Pessoa;
import com.example.springboot.services.PessoaService;

@RestController
public class PessoaController {

	@Autowired
	PessoaService service;

	@GetMapping("/pessoas")
	public List<Pessoa> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Pessoa> findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping("buscapornome/{name}")
	public Pessoa findByName(@PathVariable String name) {
		return service.findByName(name);
	}

	@PostMapping
	public Pessoa salvarPessoa(@RequestBody Pessoa obj) {
		return service.salvarPessoa(obj);
	}
	
	@PutMapping("/update")
	public Pessoa updatePessoa(@RequestBody Pessoa pessoa) {
		return service.update(pessoa);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePessoa(@PathVariable Long id) {
		return service.deletePessoaPorId(id);
	}

}
