package strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		ContextoAtividade atividade = new ContextoAtividade(new AtividadeApe());
        System.out.println(atividade.andar());
        
        atividade = new ContextoAtividade(new AtividadeBicicleta());
        System.out.println(atividade.andar());
	}

}
