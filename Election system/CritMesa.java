// @author nicolas

public class CritMesa extends Criterio {
	
	int mesa;
	
	public CritMesa(int m, Criterio zona) {
		super(zona);
		mesa = m;
	}
	
	public boolean eval(Voto v) { return mesa == v.getMesa(); }
}
