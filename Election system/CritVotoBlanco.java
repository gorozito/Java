// @author nicolas

public class CritVotoBlanco extends Criterio {
	public CritVotoBlanco(Criterio zona) { super(zona); }
	public boolean eval(Voto v) { return v.esBlanco(); }
}
