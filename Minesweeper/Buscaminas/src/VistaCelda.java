import java.util.Observable;
import java.util.Observer;
import java.awt.Button;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;

public class VistaCelda extends Button implements Observer {
	
	Celda miCelda;
		
	public VistaCelda(int i, int j, Celda c, VistaPrincipal vistaJuego) {
		super();
		miCelda = c;
		setFont(new Font("", Font.PLAIN, 26));
		GridBagLayout l1 = (GridBagLayout)vistaJuego.getLayout();
		GridBagConstraints celdas = new GridBagConstraints();
		celdas.ipadx = 30;
		celdas.ipady = 3;
		celdas.gridx = j;
		celdas.gridy = i + 2;
		l1.setConstraints(this, celdas);
		vistaJuego.add(this);
	}
	
	public void update(Observable obs, Object o) {
		if (o != null)
			setBackground(Color.WHITE);
		setForeground(miCelda.getColor());
		setLabel(miCelda.getTexto());
		repaint();
	}
}