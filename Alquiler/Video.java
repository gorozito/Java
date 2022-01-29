public class Video extends Alquilable {
	
	String pelicula;
	String genero;
	int ejemplar;
		
	public Video(String pelicula, String genero, int ejemplar, double precio) {
		super(precio);
		this.pelicula = pelicula;
		this.genero = genero;
		this.ejemplar = ejemplar;
	}
	
	public String getPelicula() {
		return pelicula;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public int getEjemplar() {
		return ejemplar;
	}
}
