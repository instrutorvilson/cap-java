package zoologico;

import modificadorprotected.Animal;
import modificadorprotected.Gato;

public class Zoologico {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.especie = "felinos";
		System.out.println(a.toString());
		
		Gato g = new Gato();
		g.especie = "Felino";
		g.cordopelo = "Black";
		g.setNumerodePatas(4);
		System.out.println(g.toString());
	}

}
