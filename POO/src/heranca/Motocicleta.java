package heranca;

public class Motocicleta extends Veiculo {
    private int cilindradas;

    
	public Motocicleta() {
	}

	public Motocicleta(String marca, String modelo, String placa, int cilindradas) {
		super(marca, modelo, placa);
        this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {		
		return  "Veiculo [marca=" + this.getMarca() + ", modelo=" + this.getModelo() +
				", placa=" + this.getPlaca() + ", Cilindradas: " + this.cilindradas + "]";
	}
	
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Cilindradas: " + this.cilindradas);
	}
        
}
