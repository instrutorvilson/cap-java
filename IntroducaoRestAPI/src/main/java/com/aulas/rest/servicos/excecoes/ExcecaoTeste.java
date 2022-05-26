package com.aulas.rest.servicos.excecoes;

public class ExcecaoTeste extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ExcecaoTeste(String msg) {
    	super(msg);
    }
}
