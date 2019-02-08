
import lejos.nxt.*;

/**
 * Classe WaitTouchSensor
 * @author Andrea Rauso
 * @author Peter Catania
 */
public class WaitTouchSensor {
	
	/**
	 * il sensore di tatto
	 */
	private TouchSensor touchSensor;
	
	/**
	 * Costruttore con 1 parametro
	 * @param touchSensor il sensore di tatto
	 */
	public WaitTouchSensor(TouchSensor touchSensor) {
		this.touchSensor = touchSensor;
	}
	
	/**
	 * Metodo waitTouch che aspetta che il sensore di tatto sia premuto o rilasciato
	 * 
	 * mode:
	 * 0 -> pressed
	 * 1 -> released
	 * @param action l'azione da aspettare
	 */
	public void waitTouch(int mode) {
		boolean finish = false;
		boolean pressed = false;
		while(!finish) {
			if(mode == 0) {
				while(!pressed) {
					pressed = touchSensor.isPressed();
				}
				finish = true;
			}else{
				if(touchSensor.isPressed()) {
					pressed = true;
					while(pressed) {
						pressed = touchSensor.isPressed();
					}
					finish = true;
				}
			}
		}
	}
}
