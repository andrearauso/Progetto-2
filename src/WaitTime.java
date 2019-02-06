
/**
 * 
 * @author Andrea Rauso
 * @author Peter Catania
 *
 */

public class WaitTime {
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
