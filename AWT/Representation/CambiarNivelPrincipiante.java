import java.awt.*;
import java.awt.event.ActionEvent;

public class CambiarNivelPrincipiante extends CambiarNivel {
	
	public CambiarNivelPrincipiante (Frame f) {
		super(f);
		setValores(228, 333, 10);
	}
	
	public void actionPerformed(ActionEvent ae) { 
		Frame nueva = new VentanaMedio("Buscaminas");
		nueva.setSize(x, y);
		frame = nueva;
		frame.repaint();
	}
}
