
public class Player {
	private int idPlayer;
	private String nombre;
	private int puntaje;
	
	public Player(int idPlayer, String nombre, int puntaje) {
		super();
		this.idPlayer = idPlayer;
		this.nombre = nombre;
		this.puntaje = puntaje;
	}

	public int getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Player [idPlayer=" + idPlayer + ", nombre=" + nombre + ", puntaje=" + puntaje + "]";
	}
	
	
	
	

}
