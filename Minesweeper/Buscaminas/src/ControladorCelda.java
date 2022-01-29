import java.awt.event.*;

public class ControladorCelda extends MouseAdapter {
	
	private Celda modeloCelda;
		
	public ControladorCelda(Celda celda) {
		modeloCelda = celda;
	}
	
	public void mouseClicked(MouseEvent me) {
		if (me.getModifiers() == 16)
			modeloCelda.presionarIzquierdo();
		if (me.getModifiers() == 4)
			modeloCelda.presionarDerecho();
	}
}