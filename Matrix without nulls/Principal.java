
public class Principal {

	public static void main(String args[]) {
	
		MatrizSinNulos m = new MatrizSinNulos(2, 2);
		
		
		try {
			Object x = new Persona(2);
			m.add(1, 1, x);
		}
		catch (PersonaException error) {
		System.out.println("error en:" + error.getDniError()); 
		}
		catch (NulosMatrizException error) {
			System.out.println("error en:" + error.getFila() + error.getCol()); }
		}
		
		
		

}




