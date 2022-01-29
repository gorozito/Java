public class Auto extends Alquilable {
	
	String matricula;
	String marca;
	String añoFabricacion;
	
	public Auto(String matricula, String marca, String añoFabricacion, double precio) {
		super(precio);
		this.matricula = matricula;
		this.marca = marca;
		this.añoFabricacion = añoFabricacion;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String añoFabricacion() {
		return añoFabricacion;
	}
}
