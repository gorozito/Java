import java.awt.event.*;
import java.awt.*;

public class ControladorDialog implements ActionListener {
	
	TextField n1, n2, fichas;
	Dialog dialog;
		
	public ControladorDialog(Dialog dialog, TextField n1, TextField n2, TextField fichas) {
		this.n1 = n1;
		this.n2 = n2;
		this.fichas = fichas;
		this.dialog = dialog;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(fichas.getText());
		dialog.setVisible(false);
		
	}
}