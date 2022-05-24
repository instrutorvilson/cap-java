package com.aulas.mvc.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Tb_venda2")
public class Venda2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "dia_compra")
	private Date data;
	
	@Transient
	private Cliente2 cliente;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Venda2() {
	}

	public Venda2(int id, Date data) {
		this.id = id;
		this.data = data;
	}

	public Cliente2 getCliente() {
		return cliente;
	}

	public void setCliente(Cliente2 cliente) {
		this.cliente = cliente;
	}

	

}
