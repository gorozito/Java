public class MatrizSinNulos extends Matriz {
	
	
	public MatrizSinNulos(int filas, int columnas) {
		super(filas, columnas);
	}
	
	
	public void add(int i, int j, Object c) throws NulosMatrizException {
		if (c != null)
			super.agregar(i, j, c);
		else {
			NulosMatrizException e = new NulosMatrizException();
			e.setFilaCol(i, j);
			throw e;
		}
	}
}
