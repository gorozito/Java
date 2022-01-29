// @author nicolas

public class Voto {
	
	private int mesa;
	private String sexo, ciudad, voto;
	private boolean impugnado;
	
	public Voto(String s, String c, String v, int m) {
		sexo = s;
		ciudad = c;
		voto = v;
		mesa = m;
		impugnado = false;
	}
	
	public int getMesa() { return mesa; }
	public String getSexo() { return sexo; }
	public String getCiudad() { return ciudad; }
	public boolean esBlanco() { return voto.length() == 0; }
	public boolean esImpugnado() { return impugnado; }
	public String getPartido() { return voto; }
	public void impugnar() { impugnado = true; }
}
