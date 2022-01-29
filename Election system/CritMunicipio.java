// @author nicolas

public class CritMunicipio extends Criterio {
	String nombre;
	
	public CritMunicipio(String n, Criterio zona) {
		super(zona);
		nombre = n;
	}
	
	public boolean eval(Voto v) {
		return v.getCiudad().equals(nombre);
	}
}
