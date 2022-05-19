package com.aulas.mvc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aulas.mvc.entidades.Contato;
import com.aulas.mvc.repositorios.ContatoRepository;

@Controller
@RequestMapping("/")
public class ContatoController {
    @Autowired
	ContatoRepository repositoryContato;
	
	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("/cadastro")
	public String formContato(Model model) {
		model.addAttribute("contato", new Contato());
		return "cadastro";
	}
		
	@PostMapping("/cadastro")
	public String inserir(@ModelAttribute Contato contato) {
		repositoryContato.save(contato);
		return "redirect:/consulta";
	}
	
	@GetMapping("/consulta")
	public String consulta(Model model) {
	   Iterable<Contato> lista = repositoryContato.findAll();
	   model.addAttribute("contatos", lista);
	   return "consulta";
	}
	
	@GetMapping("/consulta/{idcontato}")
	public String formEditar(@PathVariable("idcontato") int id, Model model) {
		Optional<Contato> ct = repositoryContato.findById(id);
		model.addAttribute("contato", ct);
		return "editar";
	}
}
