package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entidades.Calculadora;

public class CalculadoraTest {
  //AAA
	@Test
	public void resultaDeveSerDezQuandoSomarCincoComCinco() {
		//Arrange
		Calculadora calculadora = new Calculadora();
		
		//Act
		double resultado = calculadora.somar(5.0, 5.0);
		double valorEsperado = 10.0;
		
		//Assert
		Assertions.assertEquals(valorEsperado, resultado);
	}
	
}
