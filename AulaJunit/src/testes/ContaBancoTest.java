package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.ContaBanco;

public class ContaBancoTest {
    ContaBanco conta;
    double saldoAtual = 0;
    
    @BeforeEach
    public void setup() {
    	conta = new ContaBanco(1, 200);
    	saldoAtual = conta.getSaldo();
    }
	
    @Test
    public void lancaExcpetionQuandoValorDepositadoForNegativo() {
    	double valorDepositado = -10;
    	Exception ex = Assertions.assertThrows(Exception.class, () -> conta.depositar(valorDepositado));
    	Assertions.assertTrue(ex.getMessage().contains("O deposito não pode ser um valor negativo"));
    }
    
    @Test
    public void lancaExecptionQuandoValorSaqueMaiorQueSaldo()throws Exception {
    	double valorSacado = 201;
    	
    	Exception ex = Assertions.assertThrows(Exception.class, () -> conta.sacar(valorSacado)); 
    	Assertions.assertTrue(ex.getMessage().contains("saldo insuficiente"));
    }
    
    
    
    @Test
    public void diminuiSaldoQuandoSacarValorComSaldoSuficiente() throws Exception{    	
    	double valorSacado = 50;
    	conta.sacar(valorSacado);
    	double novoSaldo = conta.getSaldo();
    	
    	Assertions.assertTrue((saldoAtual - valorSacado)==novoSaldo); 
    }
    
    @Test
	public void aumentaSaldoQuandoDeposita() throws Exception {
		double valorDepositado = 100;
		conta.depositar(valorDepositado);
		double novoSaldo = conta.getSaldo();
		
		Assertions.assertTrue((novoSaldo - saldoAtual) == valorDepositado);
	}
}
