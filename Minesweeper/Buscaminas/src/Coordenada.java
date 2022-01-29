// @author nicolas

public class Coordenada {

	Integer f, c;
	
	public Coordenada(int fila, int col) {
		f = new Integer(fila);
		c = new Integer(col);
	}
	
	public int getFila() { return f.intValue(); }
	
	public int getCol() { return c.intValue(); }
	
	public String toString() { return f.toString() + c.toString(); }
}
