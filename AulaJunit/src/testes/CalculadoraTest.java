package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Calculadora;

public class CalculadoraTest {
	Calculadora calculadora; 
	
	@BeforeEach 
	 public void setup() {
		calculadora = new Calculadora(); 
     }
	
	@Test
	public void resultadoOkQuandoDiminuirDoisNumeros() {		
		double n1 = 50;
		double n2 = 100;
		
		double valorEsperado = -50;
		double valorRetornado = calculadora.subtrair(n1, n2);
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void resultadoOkQuandoMultiplicarDoisNumeros() {
		double valor = 100.0;
		double multiplicador = 2.0;
		
		double valorEsperado = 200.0;
		double valorRetornado = calculadora.multiplicar(valor, multiplicador);
		
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void resultaDeveSerDezQuandoSomarCincoComCinco() {
		double resultado = calculadora.somar(5.0, 5.0);
		double valorEsperado = 10.0;

		// Assert
		Assertions.assertEquals(valorEsperado, resultado);
	}

	@Test
	public void resultadoDivisaoOkQuandoDivisorDiferenteZero() throws Exception {
		double divisor = 10.0;
		double dividendo = 20.0;

		// Act
		double valorEsperado = 2.0;
		double valorRetornado = calculadora.dividir(dividendo, divisor);
		// Assertions
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
    @Test
	public void divisaoLancaExcecaoQuandoDivisorZero() {
		double divisor = 0.0;
		double dividendo = 10.0;

		// Act
		Exception ex = Assertions.assertThrows(Exception.class, () -> calculadora.dividir(dividendo, divisor));
		Assertions.assertTrue(ex.getMessage().contains("Não é possivel dividir por zero."));
	}
}
