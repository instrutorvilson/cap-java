package com.aulas.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.rest.dtos.UsuarioDTO;
import com.aulas.rest.entity.Usuario;
import com.aulas.rest.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
	UsuarioRepository repo;
	
	public UsuarioDTO salvar(Usuario usuario) {
		Usuario user = repo.save(usuario);
		
		return new UsuarioDTO(user);
	}
}
