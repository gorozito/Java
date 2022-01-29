// @author nicolas

public class CritVotoImpugnado extends Criterio {
	public CritVotoImpugnado(Criterio zona) { super(zona); }
	public boolean eval(Voto v) { return v.esImpugnado(); }
}
