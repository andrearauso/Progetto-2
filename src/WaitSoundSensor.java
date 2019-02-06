import lejos.nxt.*;

public class WaitSoundSensor {
	/**
	 * Il sensore di suono
	 */
	private SoundSensor soundSensor;
	
	/**
	 * Costruttore con 1 parametro
	 * @param ls il sensore di luce
	 */
	public WaitSoundSensor(SoundSensor soundSensor) {
		this.soundSensor = soundSensor;
	}
	
	/**
	 * 
	 * @param sign
	 * @param value
	 */
	public void waitSoundValue (boolean sign, int value) {
		boolean finish = false;
		while(!finish) {
			if(sign) {
				if(soundSensor.readValue() > value) {
					finish = true;
				}
			}else{
				if(soundSensor.readValue() < value) {
					finish = true;
				}
			}
			finish = false;
		}
	}
}
