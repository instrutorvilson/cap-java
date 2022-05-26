package com.aulas.rest.servicos.excecoes;

public class RecursoNaoEncontrado extends RuntimeException{
	private static final long serialVersionUID = 1L;
    
	public RecursoNaoEncontrado(String msg) {
		super(msg);
	}
}
