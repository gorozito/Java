public class ThreadB extends Thread {
	ClaseSincronizada c;
	
	public ThreadB (String str, ClaseSincronizada c, int prio) {	 
		super(str);
		this.c = c;
		this.setPriority(prio);
	}	
	
	public void run ()	{
		System.out.println(getName()+ " " + c.get());
	}
}