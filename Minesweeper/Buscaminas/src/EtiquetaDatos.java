import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observer;
import java.util.Observable;
import java.awt.Label;

public class EtiquetaDatos extends Label implements Observer {

	GridBagConstraints cartel;
	
	public EtiquetaDatos(String txt, VistaPrincipal ventana) {
		setAlignment(Label.CENTER);
		setText(txt);
		setFont(new Font("", Font.PLAIN, 22));
		setForeground(new Color(34, 22, 65));
		cartel = new GridBagConstraints();
		cartel.gridwidth = 100;
		cartel.ipadx = 45;
		cartel.ipady = 50;
		((GridBagLayout) ventana.getLayout()).setConstraints(this, cartel);
		ventana.add(this);
	}
	
	public void update(Observable obs, Object ob) {
		if (ob != null) // el juego terminó
			setText((String) ob);
		else { // se muestran los cambios de estado
		int granadasRest = ((Juego) obs).getCantidadGranadas();
		int minasRest = ((Juego) obs).getCantidadMinas();
		int segundos = ((Juego) obs).getSegundero().getCount();
		setText("ô(Gr):  " + granadasRest + "  ¤(Mn):  " + minasRest + "  Tm: " + segundos);
		}
	}
}








