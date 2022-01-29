import java.util.Vector;

public class SistemaAlquiler {

	String nombre;
	Vector alquileres;
	Vector alquilables;
	Vector clientes;
	
	public SistemaAlquiler(String nombre, Vector alquilables) {
		this.nombre = nombre;
		this.alquilables = alquilables;
		clientes = new Vector();
		alquileres = new Vector();
	}
	
	public void addAlquilable(Alquilable nuevo) {
		alquilables.add(nuevo);
	}
	
	public Alquiler alquilar(Vector elegidos, Cliente cli) {
		Fecha fechaActual = new Fecha();
		Alquiler nuevo = new Alquiler(fechaActual, elegidos, cli);
		alquileres.add(nuevo);
		if (!clientes.contains(cli))
			clientes.add(cli);
		return nuevo;
	}
	
	public double devolver(Alquiler alquiler, Fecha fechaFinal) {
		double res = alquiler.calcularPrecio(fechaFinal);
		alquileres.remove(alquiler);
		return res;
	}
}