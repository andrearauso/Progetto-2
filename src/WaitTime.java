
/**
 * Classe WaitTime
 * @author Andrea Rauso
 * @author Peter Catania
 */

public class WaitTime {
	
	/**
	 * Metodo waitTime che permette di aspettare un determinato lasso di tempo
	 * @param milliseconds il tempo di attesa
	 */
	public void waitTime(long milliseconds) {
		long now = System.currentTimeMillis();
		while(now + milliseconds > System.currentTimeMillis()) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException ie) {
				//Sleep interrupted
			}
		}
	}
}
