package entidades;

public class Calculadora {
	public int x;
	public int y;
	
    public int soma() {
    	return this.x + this.y;
    }
    
    public int soma(int n1, int n2) {
    	return n1 + n2;
    }
    
    public int soma(int[] lista) {
    	int resultado = 0;
    	for(int i = 0; i < lista.length; i++) {
    		resultado += lista[i];
    	}
    	return resultado;
    }
}
