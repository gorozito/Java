import java.awt.*;
import java.awt.event.ActionEvent;

public class CambiarNivelMedio extends CambiarNivel {
	
	public CambiarNivelMedio (Frame f) {
		super(f);
		setValores(328, 433, 30);
	}
	
	public void actionPerformed(ActionEvent ae) { 
		Frame nueva = new VentanaMedio("Buscaminas");
		nueva.setSize(x, y);
		frame = nueva;
		frame.repaint();
		
	}
}
