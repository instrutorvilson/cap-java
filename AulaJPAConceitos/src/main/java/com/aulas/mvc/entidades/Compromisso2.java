package com.aulas.mvc.entidades;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "tb_compromisso")
public class Compromisso2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String local;
	private Date data;
	private Time hora;

	@OneToOne( cascade = CascadeType.ALL)
	@JoinTable( name = "tb_contato_compromisso",
	        joinColumns = @JoinColumn(name = "idcompromisso"),
	        inverseJoinColumns = @JoinColumn(name = "idcontato")
			)
	private Contato2 contato;

	public Compromisso2() {
	}

	public Compromisso2(int id, String local, Date data, Time hora, Contato2 contato) {
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

	public Contato2 getContato() {
		return contato;
	}

	public void setContato(Contato2 contato) {
		this.contato = contato;
	}

}
