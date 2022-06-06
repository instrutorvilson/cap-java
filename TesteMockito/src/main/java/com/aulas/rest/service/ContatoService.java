package com.aulas.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.aulas.rest.entity.Contato;
import com.aulas.rest.repository.ContatoRepository;

@Service
public class ContatoService {
   @Autowired
   ContatoRepository repository;
	
   public List<Contato> pegarTodos(){
		/*Iterable<Contato> it = repository.findAll();
		 List<Contato> lista = new ArrayList<>();
		 for(Contato ct : it) {
			 lista.add(ct);
		 }
		 return lista;*/
	   return repository.findAll();
   }
   
	public Contato salvar(Contato contato) {
	    return repository.save(contato);	  
    }
	
	public Contato pesquisar(Long id) {
	   Optional<Contato> obj = repository.findById(id);	
	   Contato ct = obj.orElseThrow(() -> new EntityNotFoundException("Contato inexistente"));
	   return ct;
	}
	
	public void delete(Long id) {
		try {
		   repository.deleteById(id);	
		}
		catch(EmptyResultDataAccessException e) {
			throw new EntityNotFoundException("Contato inexistente");
		}
	}
	
	public Contato alterar(Long idcontato, Contato contato) {		
		Optional<Contato> obj = repository.findById(idcontato);	
		Contato ct = obj.orElseThrow(() -> new EntityNotFoundException("Contato inexistente"));
    	ct = contato;		
		return repository.save(ct);
	}	
	
} 