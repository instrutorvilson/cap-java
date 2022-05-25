package com.aulas.rest.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulas.rest.entidades.Contato;
import com.aulas.rest.repositorios.ContatoRepositorio;

@RestController
@RequestMapping("/contato")
public class ContatoController {
    
	@Autowired
	ContatoRepositorio repo;
	
	@GetMapping
	public ResponseEntity<List<Contato>> pegaContatos() {
		List<Contato> lista = repo.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/{nome}")
	public String ola(@PathVariable("nome") String nome) {
		return "ola " + nome;
	}
	
	@PostMapping
	public ResponseEntity<Contato> inserir(@RequestBody Contato ct){
		repo.save(ct);
		return ResponseEntity.ok(ct);
	}
}
