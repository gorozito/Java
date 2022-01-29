// @author nicolas

import java.awt.Color;

public class Marca {
	
	String estados[] = {"", "|>", "?"};
	int tipoMarca;
	Color color;
	Juego game;
		
	public Marca(Juego game) {
		this.game = game;
		tipoMarca = 0;
		color = Color.RED;
	}
	
	public String getTexto() { return estados[tipoMarca]; }
	
	public void marcar() { 
		if (tipoMarca == 2) tipoMarca = 0;
		else tipoMarca++;
		if (tipoMarca == 1) game.restarMina();
		if (tipoMarca == 2) game.sumarMina();
	}
	
	public boolean esBandera() { return tipoMarca == 1; }
	
	public Color getColor() { return color; }
}