package com.aulas.mvc.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente2")
public class Cliente2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 30)
	private String nome;
	@Column(length =  50)
	private String email;

	@OneToMany( cascade = CascadeType.ALL)
	@JoinTable( name = "tb_Venda2_cliente2",
	            joinColumns = {
	            		@JoinColumn( name = "cliente_id", referencedColumnName = "id")
	            },
	            inverseJoinColumns = {
	            		@JoinColumn( name = "venda_id", referencedColumnName = "id")
	            }
			)
	private List<Venda> vendas;

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

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public Cliente2() {

	}

	public Cliente2(int id, String nome, String email, List<Venda> vendas) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.vendas = vendas;
	}

}
