import java.awt.Rectangle;
import java.awt.*;
import java.awt.event.*;

public class CambiarNivel implements ActionListener {
	
	Frame frame;
	int x, y, minas;
	
	public CambiarNivel(Frame f) { frame = f; }
	
	protected void setValores(int tamX, int tamY, int minas) {
		x = tamX;
		y = tamY;
		this.minas = minas;
	}
}
