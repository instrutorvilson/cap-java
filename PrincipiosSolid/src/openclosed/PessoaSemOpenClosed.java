package openclosed;

public class PessoaSemOpenClosed {
    String nome;
    String identificacao;
    
    public void validaIdentificacao() {
    	if(this.identificacao.length() == 11) {
    	  System.out.println("valida cpf");	
    	}
    	
    	if(this.identificacao.length() == 14) {
    		System.out.println("valida cnpj");
    	}
    	
    	if(this.identificacao.length() == 7) {
    		System.out.println("valida rg");
    	}
    }
}
