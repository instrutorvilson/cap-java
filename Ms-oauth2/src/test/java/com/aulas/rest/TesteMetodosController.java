package com.aulas.rest;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.aulas.rest.controllers.UsuarioController;
import com.aulas.rest.entity.Usuario;

@SpringBootTest
public class TesteMetodosController {
	@Autowired
	private UsuarioController usuarioController;

	@MockBean
	private Usuario usuario;

	@BeforeEach
	void setup() {
		usuario = new Usuario(1L,"Maria","maria@gmail.com","123");
	}

	//@Test
	void retornaOkquandoExecutaSalvar() {
		when(usuarioController.salvar(usuario).status(HttpStatus.OK));
	}
}
