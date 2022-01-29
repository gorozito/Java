// @author nicolas

public abstract class Criterio {
	private Criterio sig;
	
	public Criterio(Criterio s) { sig = s; }
	protected abstract boolean eval(Voto v);
	
	// recordar que el siguiente criterio define la zona de 
	// votacion: mesa/municipio/etc..
	public boolean evalZona(Voto v) { return sig.eval(v); }
	public boolean evalTodo(Voto v) { return eval(v) && sig.eval(v); }
}
