package entidades;

public class ContaBanco {
	private int id;
	private double saldo;

	public void sacar(double valor)  throws Exception{
		if (valor >= saldo) {
			throw new Exception("saldo insuficiente");
		}
		saldo -= valor;
	}
	
	public void depositar(double valor) throws Exception {
		if(valor < 0) {
			throw new Exception("O deposito não pode ser um valor negativo");
		}
		saldo += valor;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public ContaBanco(int id, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}

	public ContaBanco() {
	}

}
