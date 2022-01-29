// @author nicolas

import java.util.Observable;
import java.util.Vector;
import java.util.Enumeration;

public class Elecciones extends Observable {
	
	private Vector partidos, votos;
	
	public Elecciones(Vector parts) {
		partidos = parts;
		votos = new Vector();
	}
	
	//mediante este metodo se incorporan votos usualmente 
	public void setVotos(Vector vs) {
		for (Enumeration e = vs.elements(); e.hasMoreElements();) 
			addVoto((Voto) e.nextElement());
	}
	
	private boolean existePartido(String part) {
		boolean existe = false;
		for (Enumeration e = partidos.elements(); e.hasMoreElements() && !existe;) {
			if (((String) e.nextElement()).equals(part)) 
				existe = true;
		}
		return existe;
	}
	
	public void addVoto(Voto v) {
		if (!existePartido(v.getPartido()))
			v.impugnar();
		votos.add(v);
		setChanged();
		notifyObservers(v);
	}
	
	public long getCantidad(Criterio c) {
		long cant = 0;
		Voto v;
		for (Enumeration e = votos.elements(); e.hasMoreElements();) {
			v = (Voto) e.nextElement();
			if (c.evalTodo(v)) cant++;
		}
		return cant;
	}
	
	// este metodo no lo requiere el enunciado pero es usado 
	// por getPorcentaje() de esta clase y por update() 
	// de Visualizacion.
	public long getCantZonal(Criterio c) {
		long cantZona = 0;
		Voto v;
		for (Enumeration e = votos.elements(); e.hasMoreElements();) {
			v = (Voto) e.nextElement();
			if (c.evalZona(v)) cantZona++;
		}
		return cantZona;
	}
	
	public double getPorcentaje(Criterio c) {
		return ((double) getCantZonal(c)/getCantidad(c)) * 100; }
}
