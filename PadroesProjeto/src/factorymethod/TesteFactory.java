package factorymethod;

public class TesteFactory {

	public static void main(String[] args) {
		/*Icms icms = new Icms();
		icms.calcular(500);
		
		Ipi ipi = new Ipi();
		ipi.calcular(500);*/
		
		Iimposto icms = FactoryMethod.getImposto(EImposto.ICMS);
		icms.calcular(500);
		
		Iimposto ipi = FactoryMethod.getImposto(EImposto.IPI);
		ipi.calcular(500);

	}

}
