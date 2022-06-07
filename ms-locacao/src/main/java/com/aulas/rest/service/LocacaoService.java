package com.aulas.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.rest.entity.Locacao;
import com.aulas.rest.repository.LocacaoRepository;

@Service
public class LocacaoService {
   @Autowired
   LocacaoRepository repository;
	
   public List<Locacao> getAll(){
	  return repository.findAll(); 
   }
   
   public Locacao save(Locacao locacao) {
	   return repository.save(locacao);
   }
}
