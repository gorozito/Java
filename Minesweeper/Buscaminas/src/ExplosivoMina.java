// @author nicolas

import java.awt.Color;

public class ExplosivoMina extends ElementoExplosivo {
	
	public ExplosivoMina(Juego game) {
		super("¤", Color.BLACK, game);
	}
	
	public void ejecutar() { game.explotoMina(); }
}
