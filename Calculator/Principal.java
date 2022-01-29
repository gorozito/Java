/**
 * 
 */

/**
 * @author Nicolas
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();		
		calc.calcular(12, 3, new Dividir());
		calc.calcular(3, new Multiplicar());
		calc.calcular(2, new Sumar());
		calc.calcular(1, new Restar());
		calc.mostrarResultado();
		
		

	}

}
