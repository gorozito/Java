

public class Prueba {
	public static void main(String args[]) {
		ClaseSincronizada c = new ClaseSincronizada();
		
		ThreadA a1 = new ThreadA("threadA1", c, 3, 28);
		ThreadA a2 = new ThreadA("threadA2", c, 4, 14);
		ThreadA a3 = new ThreadA("threadA3", c, 1, 7);
		ThreadB b1 = new ThreadB("threadB1", c, 2);
				
		a3.start();
		b1.start();
		a1.start();
		a2.start();
	}
}