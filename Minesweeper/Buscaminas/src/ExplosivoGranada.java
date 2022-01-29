//@author nicolas

import java.awt.Color;

public class ExplosivoGranada extends ElementoExplosivo {
	
	public ExplosivoGranada(Juego game) {
		super("�", Color.ORANGE, game);
	}
	
	public void ejecutar() { game.explotoGranada(); }
}

