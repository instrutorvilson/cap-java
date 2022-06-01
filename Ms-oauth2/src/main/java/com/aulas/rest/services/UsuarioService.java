package com.aulas.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aulas.rest.dtos.UsuarioDTO;
import com.aulas.rest.entity.Usuario;
import com.aulas.rest.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {
    @Autowired
	UsuarioRepository repo;
    
    @Autowired
    BCryptPasswordEncoder passwordEncoder;
	
	public UsuarioDTO salvar(Usuario usuario) {
		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		Usuario user = repo.save(usuario);
		
		return new UsuarioDTO(user);
	}
	
	public List<UsuarioDTO> listarTodos(){
		List<Usuario> usuarios = repo.findAll(); 
		List<UsuarioDTO> usuariosDTO = new ArrayList<>();
		for(Usuario user : usuarios) {
			usuariosDTO.add(new UsuarioDTO(user));
		}
		return usuariosDTO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repo.findByEmail(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuário não encontrado");
		}
		return usuario;
	}
}
