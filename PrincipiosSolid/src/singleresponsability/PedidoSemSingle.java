package singleresponsability;

public class PedidoSemSingle {
   public void adicionaProduto(Produto p) {
	  System.out.println("produto adicionado"); 
   }
   
   public void atualizaEstoque(Produto p, double quantidade) {
	   System.out.println("produto atualizado");
   }
   
   public void finalizarPedido() {
	   System.out.println("pedido finalizado");
   }
}
