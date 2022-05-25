package com.aulas.rest.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulas.rest.entidades.Contato;

@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Integer> {

}
