public class Cliente {

	String direccion;
	long dni;
	String nombre;
	
	public Cliente(String direccion, long dni, String nombre) {
		this.direccion = direccion;
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public long getDni() {
		return dni;
	}
}
