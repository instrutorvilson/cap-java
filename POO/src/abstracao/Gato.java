package abstracao;

public class Gato extends Animal{

	@Override
	public void barulho() {
		System.out.println("miau miau");		
	}

	@Override
	public void barulho(String x) {
		System.out.println(x);		
	}
}
