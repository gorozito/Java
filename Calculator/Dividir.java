
public class Dividir implements Operador {

	@Override
	public Number operar(Number valor1, Number valor2) {
		// TODO Auto-generated method stub
		if (valor2.doubleValue() != 0)
			return valor1.doubleValue() / valor2.doubleValue();
		else System.out.println("¡Syntax Error!");
		return 0;
	}

}
