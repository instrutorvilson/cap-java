package entidades;

public class Produto {
    private int id;
    private String descricao;
    private float preco;
    private float estoque;
       
	public Produto(int id, String descricao, float preco, float estoque) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}

	public Produto() {
	
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getEstoque() {
		return estoque;
	}
	
	public void setEstoque(float estoque) {
		this.estoque = estoque;
	}
    
    
}
