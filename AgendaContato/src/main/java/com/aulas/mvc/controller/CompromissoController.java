package com.aulas.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aulas.mvc.dao.DaoCompromisso;
import com.aulas.mvc.entidades.Compromisso;

@Controller
@RequestMapping("/")
public class CompromissoController {
    @GetMapping
    public String irIndice() {
    	return "index";
    }
    
    @GetMapping("/consultartodos")
    public String consultar(Model model) {
    	List<Compromisso> lista = new DaoCompromisso().getTodos();
    	model.addAttribute("lista", lista);
    	return "consultarcompromisso";
    }
    
    @GetMapping("/cadastrar")
    public String formCadastro(Model model) {
    	return "cadastro";
    }
    
}
