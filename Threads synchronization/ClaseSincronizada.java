public class ClaseSincronizada {
	private boolean available;
	private int contents;
	
	public ClaseSincronizada()	{
		available = false;
	}
	
	public synchronized int get()	{
		if (available == false)	{	
			try	{
				wait(50); 
			}	catch	(InterruptedException e)	{}	
		}
		available = false; 
		notifyAll(); 
		return contents; 
	}

	public synchronized void put(int value)	{
		if (available == true)	{	
			try	{
				wait(50); 
			}	catch (InterruptedException e)	{}
		}
		contents = value; 
		available = true; 
		notifyAll(); 
	}
}