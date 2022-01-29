public class Auto extends Alquilable {
	
	String matricula;
	String marca;
	String aņoFabricacion;
	
	public Auto(String matricula, String marca, String aņoFabricacion, double precio) {
		super(precio);
		this.matricula = matricula;
		this.marca = marca;
		this.aņoFabricacion = aņoFabricacion;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String aņoFabricacion() {
		return aņoFabricacion;
	}
}
