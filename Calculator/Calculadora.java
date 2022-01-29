
public class Calculadora {
	
	private Number resultado;

	public Calculadora() {
		super();
		resultado = 0;
	}
	
	public void apagar() { resultado = 0; }
	
	public void calcular(Number valor1, Number valor2, Operador o) {
		resultado = o.operar(valor1, valor2);
	}
	
	public void calcular(Number valor, Operador o) {
		calcular(resultado, valor, o);
	}
	
	public void mostrarResultado() {
		System.out.println(resultado);
	}

}
