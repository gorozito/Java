// @author nicolas

import java.util.Observable;
import java.awt.Color;

public class Celda extends Observable {

	private Elemento elementoContiene;
	Marca marca;
	boolean activa;
		
	public Celda(Juego game) {
		activa = true;
		marca = new Marca(game);
		elementoContiene = null;
	}
	
	public void desactivar() { activa = false; }
	
	public void setElemento(Elemento elem) {elementoContiene = elem;}
	
	public Elemento getElemento() { 
		if (tieneElemento())
			return elementoContiene;
		return null;
	}
	
	public void avisar(Object ob) {
		setChanged();
		notifyObservers(ob);
	}
	
	// solo indica si es una celda bomba/mina/vacia
	public boolean tieneElemento() { return elementoContiene != null; }
	
	public void presionarIzquierdo() {
		if (activa && tieneElemento() && !elementoContiene.estaSeleccionado() && 
				!marca.esBandera()) {
			elementoContiene.seleccionar();
			avisar("Fondo");
		}
	}
	
	public void presionarDerecho() {
		if (activa && tieneElemento() && !elementoContiene.estaSeleccionado()) {
			marca.marcar();
			avisar(null);
		}
	}
	
	// Marca viene con mem. asiganada a diferencia de Elemento
	public boolean tieneBandera() { return marca.esBandera(); }
	
	public boolean esExplosiva() { 
		if (tieneElemento())
			return elementoContiene.esExplosivo(); 
		return false;
	}
	
	public boolean clicóIzquierdo() {
		return tieneElemento() && elementoContiene.estaSeleccionado();
	}
	
	public String getTexto() { 
		if (clicóIzquierdo())
			return elementoContiene.getTexto();
		return marca.getTexto();
	}
	
	public Color getColor() {
		if (clicóIzquierdo())
			return elementoContiene.getColor();
		return marca.getColor();
	}
}