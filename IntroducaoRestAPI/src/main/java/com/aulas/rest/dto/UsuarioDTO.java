package com.aulas.rest.dto;

import com.aulas.rest.entidades.Usuario;

public class UsuarioDTO {
    private String nome;
    private String email;
    private String perfil;
    
	public UsuarioDTO(String nome, String email, String perfil) {
		this.nome = nome;
		this.email = email;
		this.perfil = perfil;
	}
    
	public UsuarioDTO(Usuario usuario) {
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.perfil = usuario.getPerfil();
	}

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

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	    
}
