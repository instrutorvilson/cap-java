package com.aulas.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulas.rest.entity.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
