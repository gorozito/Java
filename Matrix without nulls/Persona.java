
/**
 * @author nicol
 *
 */
public class Persona {
	private int dni;
	
	/**
	 * @param dni
	 */
	public Persona(int dni) throws PersonaException {
		super(); 
		
		if (dni >= 0) {
			this.dni = dni;
		}
		else {
			PersonaException e = new PersonaException();
			e.setDniError(dni);
			throw e;
		}
		this.dni = dni;
	}

	/**
	 * @return
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
}
