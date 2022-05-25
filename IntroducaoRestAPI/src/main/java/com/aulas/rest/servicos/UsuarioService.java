package com.aulas.rest.servicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.rest.dto.UsuarioDTO;
import com.aulas.rest.entidades.Usuario;
import com.aulas.rest.repositorios.UsuarioRepositorio;

@Service
public class UsuarioService {
   @Autowired	
   UsuarioRepositorio repo;
	
	public List<UsuarioDTO> listarTodos(){
		List<UsuarioDTO> usuariosDTO = new ArrayList<>();
		
		List<Usuario> usuarios = repo.findAll();
		for(Usuario user : usuarios) {
			usuariosDTO.add(new UsuarioDTO(user));
		}		
		return usuariosDTO;
	}
}
