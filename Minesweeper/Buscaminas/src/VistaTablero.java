public class VistaTablero {

	Celda[][] celdas;
	int filas, cols;
	VistaPrincipal vistaJuego;
		
	public VistaTablero(Tablero tablero, VistaPrincipal vista) {
		
		celdas = tablero.getCeldas();
		filas = tablero.getFilas();
		cols = tablero.getColumnas();
		vistaJuego = vista; 
		crearVistasCeldas();
	}
	
	private void crearVistasCeldas() {
		VistaCelda vista;
		int i = 0, j;
		for (; i < filas; i++) 
			for (j = 0; j < cols; j++) { 
				vista = new VistaCelda(i, j, celdas[i][j], vistaJuego);
				celdas[i][j].addObserver(vista);
				vista.addMouseListener(new ControladorCelda(celdas[i][j]));
			}
	}
}
