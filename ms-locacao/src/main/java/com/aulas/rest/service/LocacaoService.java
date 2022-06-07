package com.aulas.rest.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.rest.entity.Locacao;
import com.aulas.rest.feignclient.LocalFeignClient;
import com.aulas.rest.repository.LocacaoRepository;

@Service
public class LocacaoService {
   @Autowired
   LocacaoRepository repository;
   
   @Autowired
   LocalFeignClient localFeignClient;
	
   public List<Locacao> getAll(){
	  return repository.findAll(); 
   }
   
   public Locacao save(Locacao locacao) {
	   localFeignClient.reservar(locacao.getLocal(), true);
	   return repository.save(locacao);
   }
   
   public void cancelar(Long idlocacao) {
	   Optional<Locacao> obj = repository.findById(idlocacao);
	   Locacao locacao = obj.orElseThrow(() -> new EntityNotFoundException("Locação não encontrada"));
	   localFeignClient.reservar(locacao.getLocal(), false);
	   repository.delete(locacao);
   }
}
