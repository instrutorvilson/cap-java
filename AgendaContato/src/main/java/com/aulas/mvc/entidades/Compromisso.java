package com.aulas.mvc.entidades;

import java.sql.Date;
import java.time.LocalDateTime;

public class Compromisso {
	private int id;
	private Date datahora;
	private String local;
	private Contato contato; // agregação/composição

	public Compromisso() {
	}

	public Compromisso(int id, Date datahora, String local, Contato contato) {
		this.id = id;
		this.datahora = datahora;
		this.local = local;
		this.contato = contato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatahora() {
		return datahora;
	}

	public void setDatahora(Date datahora) {
		this.datahora = datahora;
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

}
