import java.awt.event.*;

public class CerrarVentana extends WindowAdapter {
	// si implemento el WindowListener tambien debo definir 
	// los metodos que no uso como "ciegos", por ende al
	// heredar de WindowAdapter, ya define todos los 
	// metodos que debe implementar como ciegos,o sea 
	// facilita la tarea.
	
	public void windowClosing(WindowEvent we) { 
		System.exit(0); 
	}
}
