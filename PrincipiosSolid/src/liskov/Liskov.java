package liskov;

public class Liskov {

	public static void main(String[] args) {
		Animal a = new Animal();
		zoo(a);
		
		Animal gato = new Gato();
        zoo(gato);
        
		Gato g1 = new Gato();
		zoo(g1);
	}
	
	public static void zoo(Animal animal) {
		animal.barulho();
	}

}
