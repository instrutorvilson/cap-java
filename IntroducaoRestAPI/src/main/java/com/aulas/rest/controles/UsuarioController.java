package com.aulas.rest.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulas.rest.dto.UsuarioDTO;
import com.aulas.rest.servicos.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
   @Autowired
   UsuarioService service;	
	
   @GetMapping
   public ResponseEntity<List<UsuarioDTO>> pegaUsuarios(){
	   return ResponseEntity.ok(service.listarTodos());
   }
}
