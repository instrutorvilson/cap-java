package decorator;

public class DecoratorSalario implements Isalario {
    private Isalario salario;   
    
	public DecoratorSalario(Isalario salario) {
		this.salario = salario;
	}

	@Override
	public double calculaSalario(Funcionario funcionario) {
		double valeTransporte = 100;
		double totalSalario = salario.calculaSalario(funcionario);
		if(funcionario.getHorasSemanais() > 20) {
			totalSalario += valeTransporte;
		}
			
		return totalSalario;
	}

}
