package com.aulas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/consulta")
	public String consulta(Model model) {
	   Iterable<Contato> lista = repositoryContato.findAll();
	   model.addAttribute("contatos", lista);
	   return "consulta";
	}
}
