package com.aulas.mvc.entidades;

import java.sql.Date;
import java.sql.Time;


public class Compromisso {
	private int id;
	private Date data;
	private Time hora;
	private String local;
	private Contato contato; // agregação/composição

	public Compromisso() {
	}
	
	
	public Compromisso(int id, Date data, Time hora, String local, Contato contato) {
		super();
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.local = local;
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

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
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
	
	

}
