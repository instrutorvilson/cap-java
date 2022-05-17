package abstracao;

public class Abstracao {

	public static void main(String[] args) {
		/*Animal a = new Animal();
		a.sleep();*/
		Gato g = new Gato();
		g.sleep();
		g.barulho();
		
		Buldogue b = new Buldogue();
		b.barulho();
		b.barulho("mxakjkjkj");
		b.latido();
	}

}
