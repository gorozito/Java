
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseDeDatos bd = new BaseDeDatos();
		Player nuevo = new Player(78, "Ricardo", 23);
		Player nuevo2 = new Player("Raul", 213);
		bd.connect();
		
		
		bd.select("Player");
		
		bd.addPlayerId(nuevo);
		bd.addPlayerSecuencial(nuevo2);
		
		bd.select("Player");
		
		
		bd.disconnect();
		
		
		

	}

}
