package interfaces;

public class Gato implements IAnimal, IMamifero{

	@Override
	public void sleep() {
		System.out.println("zzzzzzzzzz");		
	}

	@Override
	public void barulho() {
		System.out.println("miau miau");		
	}
    
	public void saltar() {
		System.out.println("saltar do gato");
	}

	@Override
	public void qtdePatas(int qtdePatas) {
		System.out.println(qtdePatas);		
	}
}
