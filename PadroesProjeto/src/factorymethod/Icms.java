package factorymethod;

public class Icms implements Iimposto {

	@Override
	public void calcular(double valor) {
		System.out.println("calculando ICMS");		
	}

}
