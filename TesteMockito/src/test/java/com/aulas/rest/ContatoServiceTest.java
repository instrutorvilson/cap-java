package com.aulas.rest;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.aulas.rest.entity.Contato;
import com.aulas.rest.repository.ContatoRepository;
import com.aulas.rest.service.ContatoService;

@ExtendWith(SpringExtension.class)
public class ContatoServiceTest {
    private Long idExistente;
    private Long idInexistente;
    private Contato contato;
    
	@InjectMocks
	private ContatoService service;
	
	@Mock
	private ContatoRepository repository;
	
	@BeforeEach
	void setup() {
		idExistente = 1L;
		idInexistente = 100L;
		contato = new Contato();
		
		Mockito.doNothing().when(repository).deleteById(idExistente);
		Mockito.doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(idInexistente);
		Mockito.when(repository.findById(idExistente)).thenReturn(Optional.of(contato));
		Mockito.doThrow(EntityNotFoundException.class).when(repository).findById(idInexistente);
	}
	
	@Test
	void naoFazNadaQuandoDeletaIdExistente() {
		Assertions.assertDoesNotThrow(() -> {
			service.delete(idExistente);
		});
	   Mockito.verify(repository, Mockito.times(1)).deleteById(idExistente);	
	}
	
	@Test
	void levantaEntityNotFoundExceptionQuandoDeleteIdInexistente() {
		Assertions.assertThrows(EntityNotFoundException.class, () ->{
			service.delete(idInexistente);
		});
		Mockito.verify(repository, Mockito.times(1)).deleteById(idInexistente);		
	}
	
	@Test
	void retornaNaoNuloQuandoConsultaPorIdExistente() {
		//Assertions.assertNotNull(service.pesquisar(idExistente));	
		Contato c = service.pesquisar(idExistente);
		Assertions.assertEquals(c, contato);
		Mockito.verify(repository).findById(idExistente);
	}
	
	@Test
	void lancaEntityNotFoundExceptionQuandoPesquisaIdInexistente() {
		Assertions.assertThrows(EntityNotFoundException.class, () -> {
			service.pesquisar(idInexistente);
		});
		Mockito.verify(repository).findById(idInexistente);
	}
}
