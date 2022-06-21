package decorator;

public class CalculoSalario implements Isalario {

	@Override
	public double calculaSalario(Funcionario funcionario) {
		return funcionario.getHorasSemanais() * funcionario.getValorHora();
	}

}
