package com.aulas.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulas.rest.entity.Locacao;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

}
