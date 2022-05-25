package com.aulas.rest.controles;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/{idcontato}")
	public ResponseEntity<Contato> pegaUmContato(@PathVariable("idcontato") int idcontato) {
		try {
			Optional<Contato> ct = repo.findById(idcontato);
			return ResponseEntity.ok(ct.get());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@PostMapping
	public ResponseEntity<Contato> inserir(@RequestBody Contato ct) {
		repo.save(ct);
		return ResponseEntity.status(HttpStatus.CREATED).body(ct);
	}

	@DeleteMapping("/{idcontato}")
	public ResponseEntity<Contato> delete(@PathVariable("idcontato") int idcontato) {
		try {
			repo.deleteById(idcontato);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} 
	}

	@PutMapping("/{idcontato}")
	public ResponseEntity<Contato> alterar(@PathVariable("idcontato") int idcontato, @RequestBody Contato ct) {
		Contato contato = repo.findById(idcontato).get();
		contato.setNome(ct.getNome());
		contato.setEmail(ct.getEmail());

		repo.save(contato);

		return ResponseEntity.ok(contato);
		// repo.save(ct);
		// return ResponseEntity.ok(ct);
	}
}
