//@author nicolas

public class CritSexo extends CritMesa {
	
	String sexo;
	
	public CritSexo(String s, int m, Criterio zona) {
		super(m, zona);
		sexo = s;
	}
	
	public boolean eval(Voto v) { 
		return super.eval(v) && sexo.equals(v.getSexo()); 
	}
}

