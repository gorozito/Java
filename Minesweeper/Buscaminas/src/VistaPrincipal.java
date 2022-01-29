import java.awt.*;
import java.awt.event.*;

public class VistaPrincipal extends Frame {
	
	public VistaPrincipal(Juego game) {
						
		setTitle("Buscaminas");
		setSize(500, 600);
		setBackground(new Color(200, 200, 200));	
		setLocation(275, 80);
		setResizable(false);
		setLayout(new GridBagLayout());
				
		this.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e) {
					System.exit(0);
			}});
		
		String cartel = "ô(Gr):  " + game.getCantidadGranadas() + "  ¤(Mn):  " + game.getCantidadMinas() + "  Tm: ";
		EtiquetaDatos texto = new EtiquetaDatos(cartel, this);
		game.addObserver(texto);
		new VistaTablero(game.getTablero(), this);
		setVisible(true);
	}
}