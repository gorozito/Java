public class Matriz {
	
	private Object[][] matrix;
	
	public Matriz() {
		matrix = null;
	}
	
	public Matriz(int filas, int columnas) {
		matrix = new Object[filas][columnas];
	}
	
	public void agregar(int i, int j, Object c) {
		matrix[i][j] = c;
	}
	
	public Object get(int i, int j) {
		return matrix[i][j];
	}
	
	
}
