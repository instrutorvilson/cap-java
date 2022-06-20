package openclosed;

public class PessoaJuridica extends PessoaOpenClosed {

	@Override
	public void validaIdentificacao() {
		System.out.println("Valida cnpj");		
	}

}
