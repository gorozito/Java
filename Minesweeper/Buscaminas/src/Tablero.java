// @author nicolas

import java.util.Vector;

public class Tablero {

	Celda[][] celdas;
	int filas, cols;
	Juego game;
	
	public Tablero(int f, int c, Juego game) {
		filas = f;
		cols = c;
		this.game = game;
		crearCeldas(game);
	}
	
	private void crearCeldas(Juego juego) {
		celdas = new Celda[filas][cols];
		int i = 0, j;
		for (; i < filas; i++) 
			for (j = 0; j < cols; j++)  
				celdas[i][j] = new Celda(game);
		setElementos(); // ubico las minas/granadas/libres...
	}
	
	private Coordenada getCoordenadaLibre() {
		Coordenada nueva = new Coordenada((int) (Math.random()*filas), (int) (Math.random()*cols));
		if (!celdas[nueva.getFila()][nueva.getCol()].tieneElemento())
			return nueva;
		else
			return getCoordenadaLibre();
	}
	
	private void setExplosivos() {
		Coordenada coord;
		int i = 0, j = 0;
		for (; i < game.getCantidadMinas(); i++) {
			coord = getCoordenadaLibre();
			celdas[coord.getFila()][coord.getCol()].setElemento(new ExplosivoMina(game));
		}
		for (; j < game.getCantidadGranadas(); j++) {
			coord = getCoordenadaLibre();
			celdas[coord.getFila()][coord.getCol()].setElemento(new ExplosivoGranada(game));
		}	
	}
	
	private boolean fueraDeRango(int fila, int col) {
		return fila < 0 || fila >= filas || col < 0 || col >= cols;
	}		
	
	private Vector obtenerAdyacentes(int i, int j) {
		Vector retorno = new Vector();
		int f = (i - 1), c;
		for (; f < i + 2; f++) 
			for (c = (j - 1); c < j + 2; c++) 
				if (!fueraDeRango(f, c) && (f != i || c != j))
					retorno.add(celdas[f][c]);
		return retorno;
	
	}
	
	private void setElementos() {
		setExplosivos();
		Vector adyacentes;
		int i = 0, j;
		for (; i < filas; i++) 
			for (j = 0; j < cols; j++) 
				if (!celdas[i][j].tieneElemento()) {
					adyacentes = obtenerAdyacentes(i, j);
					celdas[i][j].setElemento(new ElementoLibre(adyacentes));
				}
	}
		
	// verifica que en cada bandera exista un explosivo realmente
	public boolean completo() { 
		boolean incompleto = false;
		int i = 0, j;
		for (; i < filas && !incompleto; i++) 
			for (j = 0; j < cols && !incompleto; j++) 
				if (celdas[i][j].tieneBandera() &&
						!celdas[i][j].esExplosiva())
					incompleto = true;
		return !incompleto;
	}
	
	// usado al terminar el juego para mostrar los explosivos
	public void mostrarYDesactivar() {
		int i = 0, j;
		for (; i < filas; i++) 
			for (j = 0; j < cols; j++) { 
				if (celdas[i][j].esExplosiva()) {
					celdas[i][j].getElemento().visible();
					celdas[i][j].avisar("Fondo");
				}
				celdas[i][j].desactivar();
			}
	}
	
	public int getFilas() { return filas; }
	public int getColumnas() { return cols; }
	public Celda[][] getCeldas() { return celdas; }
}
	
	
