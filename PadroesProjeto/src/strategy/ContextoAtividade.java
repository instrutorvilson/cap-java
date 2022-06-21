package strategy;

public class ContextoAtividade {
	private IAtividadeFisica atividade;

	public ContextoAtividade(IAtividadeFisica atividade) {
		super();
		this.atividade = atividade;
	}
    
	public String andar() {
		return atividade.andar();
	}
}
