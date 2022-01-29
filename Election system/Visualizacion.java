// @author nicolas

import java.util.Observer;
import java.util.Observable;

public abstract class Visualizacion implements Observer {
	
	private Criterio c;
	private Elecciones e;
	protected long cantT, cantZ;
	protected double porcentaje;
	
	public Visualizacion(Criterio cri, Elecciones el) {
		c = cri;
		e = el;
		cantT = e.getCantidad(c);
		cantZ = e.getCantZonal(c);
		porcentaje = e.getPorcentaje(c);
		paint(); //definido por cada visualizacion
	}
	
	public void update(Observable obs, Object ob) {
		Voto nuevo = (Voto) ob;
		if (c.evalTodo(nuevo)) cantT++;
		if (c.evalZona(nuevo)) { 
			cantZ++;
			porcentaje = ((double) (cantT / cantZ)) * 100;
		}
	}
	
	public abstract void paint();
}