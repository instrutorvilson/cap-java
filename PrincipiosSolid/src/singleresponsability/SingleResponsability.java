package singleresponsability;

import singleresponsability.solucao.Carrinho;
import singleresponsability.solucao.PedidoComSingle;

public class SingleResponsability {

	public static void main(String[] args) {
		PedidoComSingle p = new PedidoComSingle();
		Carrinho c = new Carrinho();
		Produto prod = new Produto();
		c.adicionaProduto(prod);
		prod.atualizaEstoque(prod, 0);
	}

}
