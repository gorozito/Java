import java.awt.*;

public class DialogJugadoresFichas extends Dialog {
	
	public DialogJugadoresFichas(Frame fr) {
		super(fr);
		setSize(585, 68);
		setLocation(265, 164);
		setTitle("Ingrese los datos");
		setResizable(false);
		setLayout(new FlowLayout());
						
		TextField nombre1 = new TextField();
		nombre1.setColumns(13);
				
		TextField nombre2 = new TextField();
		nombre2.setColumns(13);
		
		TextField fichas = new TextField();
		fichas.setColumns(3);
		
		Button aceptar = new Button("ACEPTAR");
		aceptar.addActionListener(new ControladorDialog(this, nombre1, nombre2, fichas));
		
		add(new Label("Player 1"));
		add(nombre1);
		add(new Label("Player 2"));
		add(nombre2);
		add(new Label("Fichas (2^n)"));
		add(fichas);
		add(aceptar);
		setVisible(true);
	}
}