import java.awt.Color;

public abstract class ElementoExplosivo extends Elemento {
	
	protected Juego game;
	
	public ElementoExplosivo(String txt, Color c, Juego game) {
		super(txt, c);
		this.game = game;
	}
	
	public boolean esExplosivo() { return true; }
}
