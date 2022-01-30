
public class Player {
	private int IdPlayer; 
	private String Name; 
	private int Score; 
	
	public Player(int player, String nombre, int puntos) {
		IdPlayer = player;
		Name = nombre;
		Score = puntos;
	}
	
	public Player(String nombre, int puntos) {
		IdPlayer = -1;
		Name = nombre;
		Score = puntos;
	}

	public int getIdPlayer() {
		return IdPlayer;
	}

	public void setIdPlayer(int idPlayer) {
		IdPlayer = idPlayer;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	@Override
	public String toString() {
		return "Player [IdPlayer=" + IdPlayer + ", Name=" + Name + ", Score=" + Score + "]";
	}
	
	
}
