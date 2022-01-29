public class ThreadA extends Thread {
	ClaseSincronizada c;
	int nuevo;
	
	public ThreadA (String str, ClaseSincronizada c, int prio, int nuevo) {	 
		super(str);
		this.c = c;
		this.setPriority(prio);
		this.nuevo = nuevo;
	}	
	
	public void run ()	{
		c.put(nuevo);
		System.out.println(getName() + " " + c.get());
	}
}