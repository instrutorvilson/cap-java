package com.aulas.rest;

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

import com.aulas.rest.repository.ContatoRepository;
import com.aulas.rest.service.ContatoService;

@ExtendWith(SpringExtension.class)
public class ContatoServiceTest {
    private Long idExistente;
    private Long idInexistente;
    
	@InjectMocks
	private ContatoService service;
	
	@Mock
	private ContatoRepository repository;
	
	@BeforeEach
	void setup() {
		idExistente = 1L;
		idInexistente = 100L;
		
		Mockito.doNothing().when(repository).deleteById(idExistente);
		Mockito.doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(idInexistente);
	}
	
	@Test
	void naoFazNadaQuandoDeletaIdExistente() {
		Assertions.assertDoesNotThrow(() -> {
			service.delete(idExistente);
		});
	   Mockito.verify(repository, Mockito.times(1)).deleteById(idExistente);	
	}
	
	@Test
	void levantaExcecaoEmptyResultDataAccessExceptionQuandoDeleteIdInexistente() {
		Assertions.assertThrows(EntityNotFoundException.class, () ->{
			service.delete(idInexistente);
		});
		Mockito.verify(repository, Mockito.times(1)).deleteById(idInexistente);		
	}
	
}
