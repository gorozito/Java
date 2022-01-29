public class Multiplicar implements Operador {

	@Override
	public Number operar(Number valor1, Number valor2) {
		// TODO Auto-generated method stub
		return valor1.doubleValue() * valor2.doubleValue();	
	}

}