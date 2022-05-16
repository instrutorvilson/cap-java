import entidades.Pessoa;

public class Poo {

	public static void main(String[] args) {
		Pessoa obj = new Pessoa();
		/*obj.nome = "maria";
		obj.email = "maria@gmail.com";
		
		Pessoa obj2 = new Pessoa();
		obj2.nome = "Joana";
		obj2.email = "joana@gmail.com";*/
		
		obj.setNome("maria");
		obj.setEmail("maria@gmail.com");
		
		System.out.println(obj.getNome());
		System.out.println(obj.getEmail());
	}

}

//encapsulamento -> proteger um recurso: atributo, método