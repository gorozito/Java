//@author nicolas

import java.awt.Color;

public abstract class Elemento {
	
	protected boolean seleccionado;
	protected String txt;
	protected Color color;
			
	public Elemento(String texto, Color c) { 
		txt = texto;
		color = c;
		seleccionado = false;
	}
	
	public abstract boolean esExplosivo();
	
	public Color getColor() { return color; }
	
	// usado cuando termina el juego para forzar su vista
	public void visible() { seleccionado = true; }
	
	public boolean estaSeleccionado() { return seleccionado; }
	
	public abstract void ejecutar();
	
	public void seleccionar() { 
		seleccionado = true; 
		ejecutar();
	}
	
	public String getTexto() { return txt;}
}