package com.aulas.rest.dtos;

import java.util.Set;

import com.aulas.rest.entity.Role;
import com.aulas.rest.entity.Usuario;

public class UsuarioDTO {
	private String nome;
	private String email;
	private Set<Role> roles;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public UsuarioDTO(Usuario usuario) {
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.roles = usuario.getRoles();
	}

	public UsuarioDTO() {	
	}

}
