package com.aulas.mvc.controller;

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
	
}
