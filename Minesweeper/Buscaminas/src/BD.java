import java.sql.Statement;
import java.util.Vector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BD {
	
	Connection bd = null;
	String url;
	String user;
    String pass;
    Statement st;
    ResultSet rs;
    
    public BD() {
    	bd = null;
    	st = null;
    	rs = null;
    	url="jdbc:postgresql://localhost:5432/Buscaminas";
    	user = "postgres";
        pass = "nmi615";
    	
    }
    
    public void connect() {
    	try { 
    		bd = DriverManager.getConnection(url, user, pass);
    	} catch (Exception e) { System.err.println( e.getMessage() );}
    	System.out.println("Connected");
    }
    
	public void disconnect() {
		try { bd.close(); } catch (Exception e) { System.err.println( e.getMessage() ); }
		System.out.println("Unplugged");
	}
	
	public Vector<Player> getPlayers() {
		//int cantidad = 0;
		Vector<Player> players = new Vector<Player>();
		try {
			st = (Statement) bd.createStatement();
			String query = "SELECT * FROM " + addComillas("Player") + ";";
			//System.out.println(query);
	        rs = ((java.sql.Statement) st).executeQuery(query);
	        
	        while (rs.next()) {	 
	        	//cantidad++;
	        	players.add(new Player(rs.getInt("IdPlayer"), rs.getString("Nombre"), rs.getInt("Puntaje")));
	        }
	        rs.close();	       
	    } 
		catch (Exception e) { System.err.println( e.getMessage() ); }
		return players;
	} 
	
	public int getCantidadPlayers() { return ((Vector<Player>)getPlayers()).size(); }	
	
	private String addComillas(String name) { return "\"".concat(name).concat("\""); }
	private String addApostrofes(String name) { return "\'".concat(name).concat("\'"); }
	
	public void select(String table) {
		try {
			
			int id;
			String nombre;
	        
			st = (Statement) bd.createStatement();
	        rs = ((java.sql.Statement) st).executeQuery("SELECT * FROM " + addComillas(table) + ";");
	        
	        while (rs.next()) {	 
	            id = rs.getInt("IdAsignatura");
	            nombre= rs.getString("Nombre");	 
	            System.out.println("IdAsignatura: " + id + "\n");
	            System.out.println("Nombre: " + nombre);
	            System.out.println();
	        }
	 
	        rs.close();	       
	    } 
		catch (Exception e) { System.err.println( e.getMessage() ); }
	}
	
	private boolean existeJugador(Vector<Player> jugadores, Player jugador) {
		boolean existe = false;
		for (int i=0; i<jugadores.size() && !existe; i++)
			if (((Player)jugadores.elementAt(i)).getNombre().equals(jugador.getNombre()))
				existe = true;		
		return existe;
	}
	
	public void addPlayer(Player player) {
		
		Vector<Player> jugadores = getPlayers();
		System.out.println(jugadores.toString());
		int cantidad = jugadores.size();
		System.out.println(cantidad);
		String query = "INSERT INTO 'Player' VALUES (" + String.valueOf(cantidad + 1) + ", " + addApostrofes(player.getNombre()) + ", " + 
				String.valueOf(player.getPuntaje()) + ");";
        System.out.println(query);
		if (!existeJugador(jugadores, player)) {
			System.out.println("emtra");
			
			try {
				
				st = (Statement) bd.createStatement();
				rs = ((java.sql.Statement) st).executeQuery(query);
		        rs.close();	       
		    } 
			catch (Exception e) { System.err.println( e.getMessage() ); }
		}
		
	}
}
	
    
	
	
	


