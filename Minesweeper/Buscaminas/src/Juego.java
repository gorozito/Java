// @author nicolas

import java.util.Observable;
import java.util.Observer;

public class Juego extends Observable implements Observer {

	final static int filas = 10, cols = 10, minas = 8, granadas = 5;
		
	int cantMinas, cantGranadas;
	Tablero tablero;
	Segundero reloj;
	VistaPrincipal vista;
	
	public Juego() {
		cantMinas = minas;
		cantGranadas = granadas;
		tablero = new Tablero(filas, cols, this);
		vista = new VistaPrincipal(this);
		reloj = new Segundero(this);
	}
	
	public Segundero getSegundero() { return reloj; }
	
	public void update(Observable obs, Object ob) {
		avisar(null);
	}
	
	private void avisar(Object ob) {
		setChanged();
		notifyObservers(ob);
	}
	
	public void sumarMina() { 
		cantMinas++;
		avisar(null);
	}
	
	public void restarMina() { 
		cantMinas --;
		if (cantMinas == 0) {
			if (tablero.completo())
				finalizarJuego("Ganaste Fenómeno");
			else
				finalizarJuego("YOU LOSE, minas activadas");
		}
		else
			avisar(null);
	}
	
	private void finalizarJuego(String texto) {
		tablero.mostrarYDesactivar();
		reloj.kill();
		avisar(texto);	
//		Dialogo.lanzarMensaje(texto);
	}
	
	public void explotoMina() {
		finalizarJuego("GAME OVER");
	}
	
	public void explotoGranada() {
		cantGranadas--;
		if (cantGranadas == 0) 
			finalizarJuego("Estallaron las granadas");
		else
			avisar(null);
	}
	
	public Tablero getTablero() {return tablero; }
	
	public int getCantidadMinas() { return cantMinas; }

	public int getCantidadGranadas() { return cantGranadas; }
}
