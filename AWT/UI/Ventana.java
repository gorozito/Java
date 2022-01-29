import java.awt.*;
import java.awt.event.*;
import java.util.Observer;
import java.util.Observable;

public class Ventana extends Frame implements Observer {
	public Ventana(String tituloVentana, int tamx, int tamy) {
						
		setTitle(tituloVentana);
		setSize(tamx, tamy);
		setBackground(new Color(240, 240, 240));	
		setLocation(265, 135);
		setResizable(false);
				
		DialogJugadoresFichas loco = new DialogJugadoresFichas(this);
				
		this.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e) {
					System.exit(0);
			}});
		
		
	}
	
	public void update(Observable obs, Object ob) {}
}