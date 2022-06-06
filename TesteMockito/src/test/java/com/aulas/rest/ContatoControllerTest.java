package com.aulas.rest;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

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

import com.aulas.rest.entidades.Contato;
import com.aulas.rest.servicos.ContatoService;

@SpringBootTest
@AutoConfigureMockMvc
public class ContatoControllerTest {
    private Long idExistente;
    private Long idNaoExistente;
    private List<Contato> lista;
    private Contato contatoNovo;
    private Contato contatoExistente;
   	
    @Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ContatoService service;
	
	@BeforeEach
	void setup() throws Exception {
		idExistente = 1L;
		idNaoExistente = 2L;
		contatoNovo = new Contato();
		contatoExistente = new Contato(1L, "maria","maria@gmail");
		lista = new ArrayList<>();
		
		Mockito.when(service.pesquisar(idExistente)).thenReturn(contatoExistente);
		Mockito.when(service.pesquisar(idNaoExistente)).thenThrow(EntityNotFoundException.class);
		Mockito.when(service.pesquisarTodos()).thenReturn(lista);
		Mockito.when(service.salvar(any())).thenReturn(contatoExistente);		
	}
	
	@Test
	void deveRetornarStatusOKQuandoIdExistente() throws Exception {
		ResultActions result = mockMvc.perform(get("/contato/{idcontato}", idExistente).accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isOk());
	}
	
	@Test
	void deveRetornarStatus404QuandoIdExistente() throws Exception {
		ResultActions result = mockMvc.perform(get("/contato/{idcontato}", idNaoExistente).accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isNotFound());
	}
	
	@Test
	void deveRetornarOkQuandoConsultarTodos() throws Exception {
		ResultActions result = mockMvc.perform(get("/contato").accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isOk());
		/*ver ser tem conteudo*/
		//result.andExpect(jsonPath("$.email").exists());
	}
	
	
}
