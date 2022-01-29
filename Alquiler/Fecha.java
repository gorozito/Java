import java.util.Date;

public class Fecha extends Date {
	
	public Fecha() {}
	
	public Fecha(int a�o, int mes, int dia) {
		super(a�o-1900, mes-1, dia, 1, 0, 0);
	}
	
	private long verA�os() {
		return getYear()*365 + getYear()/4;
	}
	
	private long verMeses() {
		int diasMeses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (getYear() % 4 == 0) diasMeses[1] = 29;
		long dias = 0;
		for (int i = 0; i < getMonth(); i++)
			dias += diasMeses[i];
		return dias;
	}
	
	private long diasPasados() {
		return verA�os() + verMeses() + getDate();
	}
	
	public int cantidadDias(Fecha fin) {
		return (int) (fin.diasPasados() - diasPasados());
	}
}