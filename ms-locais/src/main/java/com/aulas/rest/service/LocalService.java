package com.aulas.rest.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.rest.entities.Local;
import com.aulas.rest.repository.LocalRepository;

@Service
public class LocalService {
   @Autowired
   LocalRepository repository;
   
   public List<Local> getAll(){
	   return repository.findAll();
   }
   
   public Local getOne(Long id) {
	   Optional<Local> obj = repository.findById(id);
	   Local local = obj.orElseThrow(() -> new EntityNotFoundException("Local não existe"));
	   return local;
   }
   
   public String reservar(Long idlocal, boolean reservar) {
	   Local local = this.getOne(idlocal);
	   local.setOcupado(reservar);
	   repository.save(local);
	   String msg = "Reserva realizada com sucesso";
	   if(!reservar) {
		   msg = "Cancelamento de reserva realizada com sucesso"; 
	   }
	   return msg;
   }
}
