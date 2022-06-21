package decorator;

public class Funcionario {
	private String nome;
	private double valorHora;
	private double horasSemanais;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(double horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

	public Funcionario(String nome, double valorHora, double horasSemanais) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.horasSemanais = horasSemanais;
	}

	public Funcionario() {

	}

}
