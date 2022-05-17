package crud;

import java.util.List;

import dao.DaoContato;
import entidades.Contato;

public class Crud {

	public static void main(String[] args) {
	  	//chamaSalvar()
		//chamaBuscaPorId();
		chamarPegarTodos();
	}
	public static void chamarPegarTodos() {
		List<Contato> lista = new DaoContato().getTodos();
		for(Contato ct : lista) {
			System.out.println(ct.toString());
		}
	}
	
	public static void chamaBuscaPorId() {
		Contato ct = new DaoContato().getOne(10);
		if(ct != null) {
			System.out.println(ct.toString());
		}
	}
	
	public static void chamaSalvar() {
		Contato ct = new Contato();
	  	ct.setNome("Maria");
	  	ct.setEmail("maria@gmail.com");
	  	
	  	DaoContato dc = new DaoContato();
	  	if(dc.salvar(ct)) {
	  		System.out.println("Contato salvo com sucesso.");
	  	}
	}

}
