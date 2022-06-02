package com.aulas.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.aulas.rest.controllers.UsuarioController;

@SpringBootTest
@AutoConfigureMockMvc
public class TesteControllers {
   @Autowired
   private UsuarioController usuarioController;
	
   @Test
   void contextLoads() {
	  assertThat(usuarioController).isNotNull(); 
   }
   
   @Autowired
   private MockMvc mockMvc;
   
   @Test
   void deveRetornarNaoAutorizadoSeRotaUsuarioExiste() throws Exception {
	  mockMvc.perform(get("/usuario")).andDo(print()).andExpect(status().isUnauthorized());
   }  
   
}
