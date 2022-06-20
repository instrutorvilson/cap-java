package inversaodependencia;

public class Contato {
    public void salvar(Conexao con) {
    	con.conectar();
    	System.out.println("Salvar");
    }
}
