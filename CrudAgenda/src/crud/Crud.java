package crud;

import utilidades.Conexao;

public class Crud {

	public static void main(String[] args) {
	  	if (Conexao.conectar() != null) {
	  		System.out.println("conectado");
	  	}
	}

}
