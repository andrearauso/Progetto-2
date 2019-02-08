import lejos.nxt.*;

/**
 * Classe WaitUltrasonicSensor
 * @author Andrea Rauso
 * @author Peter Catania	
 */
public class WaitUltrasonicSensor {

	/**
	 * il sensore a ultrasuoni
	 */
	private UltrasonicSensor ultrasonicSensor;
	
	/**
	 * Costruttore con 1 parametro
	 * @param ultrasonicSensor il sensore di ultrasuoni
	 */
	public WaitUltrasonicSensor(UltrasonicSensor ultrasonicSensor) {
		this.ultrasonicSensor = ultrasonicSensor;
	}
	
	/**
	 * Metodo waitDistanceValue che aspetta una determinata distanza dal sensore a ultrasuoni
	 * @param sign indica se il valore deve essere maggiore o minore
	 * @param value il valore da trovare
	 */
	public void waitDistanceValue (boolean sign, int value) {
		boolean finish = false;
		while(!finish) {
			if(sign) {
				if(ultrasonicSensor.getDistance() > value) {
					finish = true;
				}else {
					finish= false;
				}
			}else{
				if(ultrasonicSensor.getDistance() < value) {
					finish = true;
				}else {
					finish = false;
				}
			}
		}
	} 
}
