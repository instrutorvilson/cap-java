import entidades.Calculadora;
import entidades.Pessoa;
import heranca.Motocicleta;
import heranca.Veiculo;

public class Poo {

	public static void main(String[] args) {
      // criarObjetoPessoa();
	  //criarObjetoCalculadora();
	  //criaObjetoVeiculo();	
		criaObjetoMotocicleta();
	}
	
	public static void criaObjetoMotocicleta() {
	   Motocicleta	m1 = new Motocicleta();
	   m1.setCilindradas(190);
	   m1.setMarca("Honda");
	   m1.setModelo("xre");
	   m1.setPlaca("LZE-8741");
	   //System.out.println(m1.toString());
	   m1.imprimirDados();
	   
	   Motocicleta m2 = new Motocicleta("Honda","ML","abc-1234",125);
	   System.out.println(m2.toString());
	}
	
	public static void criaObjetoVeiculo() {
		Veiculo v1 = new Veiculo("Chevrolet", "Corsa", "lzz-3456");
		System.out.println(v1.toString());
	}
	
	public static void criarObjetoCalculadora() {
		Calculadora c1 = new Calculadora();
		c1.x = 1000;
		c1.y = 20;
	   
		int[] array1 = {10,20,30,40};
		
		System.out.println(c1.soma());
		System.out.println(c1.soma(300, 281));
		System.out.println(c1.soma(array1));	
	}
	
	public static void criarObjetoPessoa() {
		Pessoa obj = new Pessoa();
		/*obj.nome = "maria";
		obj.email = "maria@gmail.com";
		
		Pessoa obj2 = new Pessoa();
		obj2.nome = "Joana";
		obj2.email = "joana@gmail.com";*/
		
		/*obj.setNome("maria");
		obj.setEmail("maria@gmail.com");
		obj.setCpf("12345678912");
		
		System.out.println(obj.getNome());
		System.out.println(obj.getEmail());
		System.out.println(obj.getCpf());
		
		Pessoa obj3 = new Pessoa("Jose");
		System.out.println(obj3.getNome());

		 */
		Pessoa obj4 = new Pessoa("Janete","janete@gmail.com","12378923561");
		System.out.println(obj4.getNome());
		System.out.println(obj4.getEmail());
		System.out.println(obj4.getCpf());
	}

}
//encapsulamento -> proteger um recurso: atributo, método