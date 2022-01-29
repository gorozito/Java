import java.awt.*;
import java.awt.MenuItem;

public class Ventana extends Frame {
	
	public static final int cantMinas = 10;
	public static final int  cantTiempo = 10;
	
	public Ventana(String title, int minas, int tiempo, int x, int y, int grw, int ipy, int ipx, int incrGridy, int celx, int cely) {
		
		super(title);
		setSize(x, y);
						
		MenuBar menu = new MenuBar();
		
		Menu m1 = new Menu("Archivo");
		m1.add(new MenuItem("Juego nuevo"));
		m1.add(new MenuItem("Mejores tiempos"));
		MenuItem salir = new MenuItem("Salir");
		m1.add(salir);
		
		Menu m2 = new Menu("Opciones");
		MenuItem principiante = new MenuItem("Principiante");
		m2.add(principiante);
		MenuItem medio = new MenuItem("Medio");
		m2.add(medio);
		m2.add(new MenuItem("Experto"));
		m2.add(new MenuItem("Personalizado"));
		
		Menu m3 = new Menu("Ayuda");
		
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);		
		
		setMenuBar(menu);
				
		GridBagLayout l1 = new GridBagLayout();
		GridBagConstraints cartel = new GridBagConstraints();
		GridBagConstraints celdas = new GridBagConstraints();
		setLayout(l1);
		
		Etiqueta datos = new Etiqueta (cantMinas, cantTiempo);
		cartel.gridwidth = grw;
		cartel.ipady = ipy;
		l1.setConstraints(datos, cartel);
		celdas.ipadx = ipx;
		Button b;
		
		for (int i=0; i<celx; i++) {
			for (int j=0; j<cely;j++) {
				b = new Button();
				celdas.gridx = j;
				celdas.gridy = i + incrGridy;
				l1.setConstraints(b, celdas);
				add(b);
			}
		}
				
		add(datos);	
								
		//	defino los eventListener
		//	y agrego dicho objeto como Listener
		salir.addActionListener(new Cerrar());
		principiante.addActionListener(new CambiarNivelPrincipiante(this));
		medio.addActionListener(new CambiarNivelMedio(this));
		addWindowListener(new CerrarVentana());
	}
}
