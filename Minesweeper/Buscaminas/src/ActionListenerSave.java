import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerSave implements ActionListener {

	BD base = null;
	Player jugadorNuevo = null;
	String name, points;
	
	public ActionListenerSave(BD base, String name, String points) {
		this.name = name;
		this.points = points;
		this.base = base;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		jugadorNuevo = new Player(base.getCantidadPlayers() + 1, name, Integer.parseInt(points));
		base.addPlayer(jugadorNuevo);
		System.out.println(base.getCantidadPlayers());
		
	}

}
