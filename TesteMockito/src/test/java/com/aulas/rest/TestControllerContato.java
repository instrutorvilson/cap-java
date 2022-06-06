package com.aulas.rest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.aulas.rest.entity.Contato;
import com.aulas.rest.service.ContatoService;

@SpringBootTest
@AutoConfigureMockMvc
public class TestControllerContato {
    private Long idExistente;
    private Long idInexistente;
    
    private Contato contatoExistente;
    
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ContatoService service;
	
	@BeforeEach
	void setup() {
		idExistente= 1L;
		idInexistente = 2L;
		contatoExistente = new Contato(idExistente, "maria", "maria@gmail");
		
		Mockito.when(service.pesquisar(idExistente)).thenReturn(contatoExistente);
		Mockito.when(service.pesquisar(idInexistente)).thenThrow(EntityNotFoundException.class);
	}

	@Test
    void deveRetornarOkQuandoPesquisaIdExistente() throws Exception {
	    ResultActions result =	mockMvc.perform(get("/contato/{idcontato}", idExistente)
		       .accept(MediaType.APPLICATION_JSON));
	    result.andExpect(status().isOk());
	}
	
	@Test
	void deveLancarEntityNotFoundExceptionQuandoPesquisaIdInexistente() throws Exception {
		ResultActions result =	mockMvc.perform(get("/contato/{idcontato}", idInexistente)
			                           .accept(MediaType.APPLICATION_JSON));
		
		    result.andExpect(res -> assertTrue(res.getResolvedException() instanceof EntityNotFoundException));
	}
}
