import java.util.Vector;
import java.util.Date;

public class Ej8Pr3 {

	public static void main(String args[]) {
		
		Vector elegidos = new Vector();
		Vector alquilables = new Vector();
				
		alquilables.add(new Video("Rambo 1", "Accion", 1, 1.50));
		alquilables.add(new Video("Rocky 1", "Accion", 1, 1.50));
		alquilables.add(new Video("Terminator 2", "Accion", 2, 1.50));
		alquilables.add(new Video("Codigo Da Vinci", "Drama", 6, 2.50));
		
		Cliente c1 = new Cliente("Rauch 1032", 29160178, "Ulises Miracco");
		
		SistemaAlquiler s = new SistemaAlquiler("Miracco Video Club", alquilables);
		
		Alquiler a1 = s.alquilar(alquilables, c1);
		
		Fecha devolucion = new Fecha(2006, 7, 2);
		System.out.println(s.devolver(a1, devolucion));
		
		
		
		
		
		
		
		
		
	}
}
