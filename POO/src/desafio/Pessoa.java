package desafio;

public class Pessoa {
    private int id;
    private String nome;
    private String contato;
   
    
   	public Pessoa() {
	}

	public Pessoa(int id, String nome, String contato) {
		this.id = id;
		this.nome = nome;
		this.contato = contato;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
    
    public void salvar() {
    	System.out.println("Salvando pessoa...");
    }
    
    public void display() {
    	System.out.println("Id: " + this.id);
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Contato: " + this.contato);
    }
}
