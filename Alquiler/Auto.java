public class Auto extends Alquilable {
	
	String matricula;
	String marca;
	String a�oFabricacion;
	
	public Auto(String matricula, String marca, String a�oFabricacion, double precio) {
		super(precio);
		this.matricula = matricula;
		this.marca = marca;
		this.a�oFabricacion = a�oFabricacion;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String a�oFabricacion() {
		return a�oFabricacion;
	}
}
