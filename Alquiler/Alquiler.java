import java.util.Vector;
import java.util.Enumeration;

public class Alquiler {

	Fecha fechaInicio;
	Cliente inquilino;
	Vector alquilados;
	
	public Alquiler(Fecha fechaInicio, Vector alquilados, Cliente inquilino) {
		this.fechaInicio = fechaInicio;
		this.inquilino = inquilino;
		this.alquilados = alquilados;
	}
	
	public double calcularPrecio(Fecha fechaFinal) {
		int dias = fechaInicio.cantidadDias(fechaFinal);
		double res = 0;
		for (Enumeration e = alquilados.elements(); e.hasMoreElements();)
			res+= ((Alquilable) e.nextElement()).getPrecio() * dias;
		return res;
	}
}
