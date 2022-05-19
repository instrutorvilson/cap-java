package com.aulas.mvc.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aulas.mvc.entidades.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Integer> {

}

