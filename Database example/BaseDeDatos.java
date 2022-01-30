import java.sql.Statement;
import java.util.Vector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BaseDeDatos {
	
	private Connection bd = null;
	private String url;
	private String user;
	private String pass;
	private Statement st;
	private ResultSet rs;
    
    public BaseDeDatos() {
    	bd = null;
    	st = null;
    	rs = null;
    	url="jdbc:postgresql://localhost:5432/Buscaminas2";
    	user = "postgres";
        pass = "nmi615";    	
    }
    
    public void connect() {
    	try { 
    		bd = DriverManager.getConnection(url, user, pass);
    	} 
    	catch (Exception e) { 
    		System.err.println( e.getMessage() );
    	}
    	System.out.println("Connected");
    }
    
	public void disconnect() {
		try { bd.close(); } catch (Exception e) { System.err.println( e.getMessage() ); }
		System.out.println("Unplugged");
	}
	
	public Vector<Player> getPlayers() {
		
		Vector<Player> players = new Vector<Player>();
		try {
			st = (Statement) bd.createStatement();
			String query = "SELECT * FROM " + addComillas("Player") + ";";
			rs = ((Statement) st).executeQuery(query);
	        
	        while (rs.next()) {	 
	        	players.add(new Player(rs.getInt("IdPlayer"), rs.getString("Name"), rs.getInt("Score")));
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
			
			st = (Statement) bd.createStatement();
	        rs = ((Statement) st).executeQuery("SELECT * FROM " + addComillas(table) + ";");
	        
	        while (rs.next()) {	 
	            System.out.println("IdPlayer: " + rs.getInt("IdPlayer") + "\n");
	            System.out.println("Nombre: " + rs.getString("Name") + "\n");
	            System.out.println("Score: " + rs.getInt("Score") + "\n");
	        }
	        rs.close();	       
	    } 
		catch (Exception e) { System.err.println( e.getMessage() ); }
	}
	
	
	private boolean existeJugador(Vector<Player> jugadores, Player jugador) {
		boolean existe = false;
		for (int i=0; i<jugadores.size() && !existe; i++)
			if (((Player)jugadores.elementAt(i)).getIdPlayer() == jugador.getIdPlayer())
				existe = true;		
		return existe;
	}
	
	public void addPlayerId(Player player) {
		if (existeJugador(getPlayers(), player)) 
			System.out.println("Ya existe un registro con ese Id");
		// gestionar el error con Excepciones
		else
			addPlayer(player, player.getIdPlayer()); 		
	}
	
	public void addPlayerSecuencial(Player player) {
		int ultimo = getPlayers().size()+1;
		player.setIdPlayer(ultimo);		
		addPlayer(player, ultimo); 	
	}
	
	private void addPlayer(Player player, int id) {
		
		String query = "INSERT INTO " + addComillas("Player") + " VALUES (" + String.valueOf(id) + ", " 
				+ addApostrofes(player.getName()) + ", " + String.valueOf(player.getScore()) + ");";
        System.out.println(query);
		try {
				st = (Statement) bd.createStatement();
				rs = ((Statement) st).executeQuery(query);
		        rs.close();	       
		    } 
			catch (Exception e) { System.err.println( e.getMessage() ); }
		}
}