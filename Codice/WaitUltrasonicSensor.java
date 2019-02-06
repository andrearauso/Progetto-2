import lejos.nxt.*;

public class WaitUltrasonicSensor {

	private UltrasonicSensor us;
	
	/**
	 * Costruttore con 1 parametro
	 * @param ls il sensore di luce
	 */
	public WaitUltrasonicSensor(UltrasonicSensor us) {
		this.us = us;
	}
	
	/**
	 * 
	 * @param sign
	 * @param value
	 */
	public void waitDistanceValue (boolean sign, int value) {
		boolean finish = false;
		while(!finish) {
			if(sign) {
				if(us.getDistance() > value) {
					finish = true;
				}
			}else{
				if(us.getDistance() < value) {
					finish = true;
				}
			}
			finish = false;
		}
	} 
}
