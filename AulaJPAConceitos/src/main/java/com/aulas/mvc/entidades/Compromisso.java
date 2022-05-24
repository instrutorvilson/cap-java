package com.aulas.mvc.entidades;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Compromisso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String local;
	private Date data;
	private Time hora;

	@OneToOne
	@JoinColumn(name = "idcontato")
	private Contato contato;

	public Compromisso() {
	}

	public Compromisso(int id, String local, Date data, Time hora, Contato contato) {
		super();
		this.id = id;
		this.local = local;
		this.data = data;
		this.hora = hora;
		this.contato = contato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
