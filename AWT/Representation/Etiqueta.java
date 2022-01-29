import java.awt.*;

public class Etiqueta extends Label {
	
	public Etiqueta (int minas, int tiempo) {
		setText("Minas: " + minas + " Tiempo: " + tiempo);
		setAlignment(Label.CENTER);
		setFont(new Font("", Font.PLAIN, 18));
		setForeground(new Color(155, 60, 35));
	}
	
	
	
	
	
	
}
