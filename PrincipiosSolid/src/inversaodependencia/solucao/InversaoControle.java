package inversaodependencia.solucao;

public class InversaoControle {
  public static void main(String[] args) {
	DBMysql con = new DBMysql();
	ContatoComAbstracao ct = new ContatoComAbstracao();
	ct.salvar(con);		
	
	DBOracle dbcon = new DBOracle();
	ContatoComAbstracao ct2 = new ContatoComAbstracao();
	ct2.salvar(dbcon);
}
}
