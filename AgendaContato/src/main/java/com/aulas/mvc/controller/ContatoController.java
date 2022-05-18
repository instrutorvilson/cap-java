package com.aulas.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aulas.mvc.dao.DaoContato;
import com.aulas.mvc.entidades.Contato;

@Controller
@RequestMapping("/contato")
public class ContatoController {
   
	@GetMapping("/cadastro")
	public String cadastrarContato(Model model) {
		model.addAttribute("contato", new Contato());
		return "cadastro";
	}
	
	@GetMapping("/consulta")
	public String consultaContato(Model model) {
		List<Contato> lista = new DaoContato().getTodos();
		
		model.addAttribute("lista", lista);
		return "consulta";
	}
}
