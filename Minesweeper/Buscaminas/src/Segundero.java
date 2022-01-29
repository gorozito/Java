import java.util.Observable;

public class Segundero extends Observable implements Runnable {
	
	int count;
	Thread miThread;
	
	public Segundero(Juego game) {
		count = 0;
		addObserver(game);
		miThread = new Thread(this);
		miThread.start(); // corre el run() implicitamente
	}
	
	public int getCount() { return count; }
	
	public void kill() { miThread.stop(); }
	
	public void run() {
		try	{
			Thread.sleep(1000); // lo libero 1 segundo
			count++;
			setChanged();
			notifyObservers();
			}	
		//	sleep() puede lanzar una excepción que debe  
		//  ser capturada, aunque no sea gestionada.
		catch (InterruptedException e)	{} 
		run();							 	
	}
}