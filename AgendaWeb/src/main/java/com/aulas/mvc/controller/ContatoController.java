package com.aulas.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aulas.mvc.entidades.Contato;

@Controller
@RequestMapping("/contato")
public class ContatoController {
  
	@GetMapping
	public String verContato(Model model) {
		Contato ct = new Contato(1,"Maria", "maria@gmail.com");
		
		model.addAttribute("contato", ct);
		
		return "consultacontato";
	}
	
	@GetMapping("/consulta")
	public String listaContatos(Model model) {
		List<Contato> lista = new ArrayList<>();
		lista.add(new Contato(1,"Maria","maria@gmail.com"));
		lista.add(new Contato(2,"Joana","joana@gmail.com"));
		lista.add(new Contato(1,"Carla","carla@gmail.com"));
		lista.add(new Contato(1,"Ursula","ursula@gmail.com"));
		
		model.addAttribute("lista", lista);
		
		return "tabelacontatos";
	}
	
}
