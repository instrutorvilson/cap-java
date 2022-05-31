package com.aulas.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String authorithy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorithy() {
		return authorithy;
	}

	public void setAuthorithy(String authorithy) {
		this.authorithy = authorithy;
	}

	public Role(Long id, String authorithy) {
		this.id = id;
		this.authorithy = authorithy;
	}

	public Role() {

	}
}
