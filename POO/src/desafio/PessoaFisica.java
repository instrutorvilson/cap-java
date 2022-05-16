package desafio;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
		   this.cpf = cpf;
		}
		else {
			System.out.println("cpf inválido");
		}
	}
	
	public void display() {
    	/*System.out.println("Id: " + this.getId());
    	System.out.println("Nome: " + this.getNome());
    	System.out.println("Contato: " + this.getContato());*/
		super.display();
    	System.out.println("cpf:" + this.getCpf());
    }

	public PessoaFisica(int id, String nome, String contato, String cpf) {
		super(id, nome, contato);
		this.setCpf(cpf);
	}
	
	
}
