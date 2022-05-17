package crud;

import dao.DaoContato;
import entidades.Contato;

public class Crud {

	public static void main(String[] args) {
	  	Contato ct = new Contato();
	  	ct.setNome("Maria");
	  	ct.setEmail("maria@gmail.com");
	  	
	  	DaoContato dc = new DaoContato();
	  	if(dc.salvar(ct)) {
	  		System.out.println("Contato salvo com sucesso.");
	  	}
	}

}
