// @author nicolas

public class CritVotoPartido extends Criterio {
	
	String partido;
	
	public CritVotoPartido(String p, Criterio zona) {
		super(zona);
		partido = p;
	}
	
	public boolean eval(Voto v) {
		return v.getPartido().equals(partido);
	}
}
