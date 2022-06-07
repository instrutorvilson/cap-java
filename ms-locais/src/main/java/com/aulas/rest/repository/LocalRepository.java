package com.aulas.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulas.rest.entities.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long>{

}
