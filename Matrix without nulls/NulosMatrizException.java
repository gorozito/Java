public class NulosMatrizException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i, j;
	public void setFilaCol(int ii, int jj) {
		i = ii;
		j = jj;
	}
	public int getFila() {
		return i;
	}
	public int getCol() {
		return j;
	}
}
