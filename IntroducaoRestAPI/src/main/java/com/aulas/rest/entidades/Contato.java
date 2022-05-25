package com.aulas.rest.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Contato() {

	}

	public Contato(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

}
