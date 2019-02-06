
import lejos.nxt.*;

/**
 * 
 * @author Andrea Rauso
 * @author Peter Catania
 */

public class WaitLightSensor {
	
	/**
	 * Il sensore di luce
	 */
	private LightSensor ls;
	
	/**
	 * Costruttore con 1 parametro
	 * @param ls il sensore di luce
	 */
	public WaitLightSensor(LightSensor ls) {
		this.ls = ls;
	}
	
	/**
	 * 
	 * @param sign
	 * @param value
	 */
	public void waitLightValue (boolean sign, int value) {
		boolean finish = false;
		while(!finish) {
			if(sign) {
				if(ls.getLightValue() > value) {
					finish = true;
				}
			}else{
				if(ls.getLightValue() < value) {
					finish = true;
				}
			}
			finish = false;
		}
	}
	
	public void waitNormalizedLightValue(boolean sign, int value) {
		boolean finish = false;
		while(!finish) {
			if(sign) {
				if(ls.getNormalizedLightValue() > value) {
					finish = true;
				}
			}else{
				if(ls.getNormalizedLightValue() < value) {
					finish = true;
				}
			}
			finish = false;
		}
		
	}
}
