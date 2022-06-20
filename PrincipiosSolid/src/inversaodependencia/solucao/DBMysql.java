package inversaodependencia.solucao;

public class DBMysql implements IDBconexao{
    public void conectar() {
    	System.out.println("conectado ao mysql");
    }
}
