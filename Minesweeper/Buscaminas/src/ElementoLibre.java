//@author nicolas

import java.util.Vector;
import java.awt.Color;
import java.util.Enumeration;

public class ElementoLibre extends Elemento {
	
	Vector adyacentes; // celdas adyacentes
	
	public ElementoLibre(Vector ady) {
		super("", Color.BLUE);
		adyacentes = ady;
	}
	
	private int cantidadMinasAdyacentes() {
		int cantidad = 0;
		for (Enumeration e = adyacentes.elements(); e.hasMoreElements();) 
			if (((Celda) e.nextElement()).getElemento().esExplosivo())
				cantidad++;
		return cantidad;
	}
	
	public void ejecutar() {
		if (cantidadMinasAdyacentes() > 0)
			txt = String.valueOf(cantidadMinasAdyacentes());
		else
			for (Enumeration e = adyacentes.elements(); e.hasMoreElements();)
				((Celda) e.nextElement()).presionarIzquierdo();
	}
	
	public boolean esExplosivo() { return false; }
}