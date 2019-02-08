import lejos.nxt.*;

/**
 * Classe WaitSoundSensor
 * @author Andrea Rauso
 * @author Peter Catania
 */
public class WaitSoundSensor {
	/**
	 * Il sensore di suono
	 */
	private SoundSensor soundSensor;
	
	/**
	 * Costruttore con 1 parametro
	 * @param soundSensor il sensore di suono
	 */
	public WaitSoundSensor(SoundSensor soundSensor) {
		this.soundSensor = soundSensor;
	}
	
	/**
	 * Metodo waitSoundValue che aspetta un valore dal sensore di suono
	 * @param sign indica se il valore deve essere maggiore o minore
	 * @param value il valore da trovare
	 */
	public void waitSoundValue (boolean sign, int value) {
		boolean finish = false;
		while(!finish) {
			if(sign) {
				if(soundSensor.readValue() > value) {
					finish = true;
				}else {
					finish = false;
				}
			}else{
				if(soundSensor.readValue() < value) {
					finish = true;
				}else {
					finish = false;
				}
			}
		}
	}
}
