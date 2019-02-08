
import lejos.nxt.*;

/**
 * Classe WaitLightSensor
 * @author Andrea Rauso
 * @author Peter Catania
 */

public class WaitLightSensor {
	
	/**
	 * Il sensore di luce
	 */
	private LightSensor lightSensor;
	
	/**
	 * Costruttore con 1 parametro
	 * @param lightSensor il sensore di luce
	 */
	public WaitLightSensor(LightSensor lightSensor) {
		this.lightSensor = lightSensor;
	}
	
	/**
	 * Metodo waitLightValue che aspetta un valore dal sensore di luce
	 * @param sign indica se il valore deve essere maggiore o minore
	 * @param value il valore da trovare
	 */
	public void waitLightValue (boolean sign, int value) {
		boolean finish = false;
		while(!finish) {
			if(sign) {
				if(lightSensor.getLightValue() > value) {
					finish = true;
				}else {
					finish = false;
				}
			}else{
				if(lightSensor.getLightValue() < value) {
					finish = true;
				}else {
					finish = false;
				}
			}
		}
	}
	
	/**
	 * Metodo waitLightValue che aspetta un valore normalizzato (da 0 a 1023) dal sensore di luce
	 * @param sign indica se il valore deve essere maggiore o minore
	 * @param value il valore da trovare
	 */
	public void waitNormalizedLightValue(boolean sign, int value) {
		boolean finish = false;
		while(!finish) {
			if(sign) {
				if(lightSensor.getNormalizedLightValue() > value) {
					finish = true;
				}else {
					finish = false;
				}
			}else{
				if(lightSensor.getNormalizedLightValue() < value) {
					finish = true;
				}else {
					finish = false;
				}
			}
		}
		
	}
}
