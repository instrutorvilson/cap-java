package com.aulas.rest;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class TestControllerContato {
    private Long idExistente;
    private Long idInexistente;
    
    private Contato contatoExistente;
    private Contato contatoNovo;
    
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ContatoService service;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@BeforeEach
	void setup() {
		idExistente= 1L;
		idInexistente = 2L;
		
		contatoNovo = new Contato();
		contatoExistente = new Contato(idExistente, "maria", "maria@gmail");
		
		Mockito.when(service.pesquisar(idExistente)).thenReturn(contatoExistente);
		Mockito.when(service.pesquisar(idInexistente)).thenThrow(EntityNotFoundException.class);
		Mockito.when(service.salvar(any())).thenReturn(contatoExistente);
	}

	@Test
    void deveRetornarOkQuandoPesquisaIdExistente() throws Exception {
	    ResultActions result =	mockMvc.perform(get("/contato/{idcontato}", idExistente)
		       .accept(MediaType.APPLICATION_JSON));
	    result.andExpect(status().isOk());
	}
	
	@Test
	void deveRertornarStatus404QuandoPesquisaIdInexistente() throws Exception {
		ResultActions obj =	mockMvc.perform(get("/contato/{idcontato}", idInexistente)
			                           .accept(MediaType.APPLICATION_JSON));
		
		    obj.andExpect(status().isNotFound());		    
	}
	
	@Test
	void deveRetornarStatu201QuandoContatoSalvoComSucesso() throws Exception {
		String jsonBody = objectMapper.writeValueAsString(contatoNovo);
		ResultActions result = mockMvc.perform(post("/contato")
			   .content(jsonBody)
			   .contentType(MediaType.APPLICATION_JSON)
			   .accept(MediaType.APPLICATION_JSON));
		
		result.andExpect(status().isCreated());
				
	}
}
