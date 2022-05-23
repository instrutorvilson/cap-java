package com.aulas.mvc.DTO;

import java.sql.Date;
import java.sql.Time;

public class CompromissoDTO {
	private Date data;
	private Time hora;
	private String local;
	private int idcontato;

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

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getIdcontato() {
		return idcontato;
	}

	public void setIdcontato(int idcontato) {
		this.idcontato = idcontato;
	}

	public CompromissoDTO() {
	}

}
