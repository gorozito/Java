import java.util.Vector;

// @author nicolas

public class BuscaMinas {

	public static void main(String args[]) {
		
		
		BD bd = new BD();
		bd.connect();
		Dialogo dialogo = new Dialogo(bd);
	
//		Vector<Player> players = bd.getPlayers();
//		for (int i = 0; i<players.size(); i++)
//			System.out.println(((Player)players.elementAt(i)).toString());

		dialogo.setPlayers(bd.getPlayers());
		
		
		//Juego game = new Juego();
		bd.disconnect();
	
		
	}
}