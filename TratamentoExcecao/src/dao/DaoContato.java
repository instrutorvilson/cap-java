package dao;

import entidades.Contato;

public class DaoContato {
	public boolean salvar(Contato ct) {
    	try {
    		System.out.println("Conectou no banco");
    		int x = 10;
    		int y = 0;
    		int z = x / y;
     	}
    	catch(Exception e) {
    		System.out.println("Ocorreu erro");
    	}
    	finally {
    	  System.out.println("Fechou conexão");
    	}
    	return true;
    }
}
