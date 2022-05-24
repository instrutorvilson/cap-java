package entidades;

public class Calculadora {
	public double somar(double n1, double n2) {
		return n1 + n2;
	}

	public double subtrair(double n1, double n2) {
		return n1 - n2;
	}

	public double multiplicar(double n1, double n2) {
		return n1 * n2;
	}

	public double dividir(double n1, double n2) throws Exception{
		if( n2 <= 0) {
			throw new Exception("Não é possivel dividir por zero.");
		}
		return n1 / n2;
	}
}
