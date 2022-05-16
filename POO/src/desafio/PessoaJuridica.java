package desafio;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void display() {
   		super.display();
    	System.out.println("cpf:" + this.getCnpj());
    }

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getContato()="
				+ getContato() + "]";
	}

	public PessoaJuridica(int id, String nome, String contato, String cnpj) {
		super(id, nome, contato);
		this.setCnpj(cnpj);
	}
	
	
}
