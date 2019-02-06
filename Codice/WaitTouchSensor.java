
import lejos.nxt.*;

/**
 * 
 * @author Andrea Rauso
 * @author Peter Catania
 */
public class WaitTouchSensor {
	private TouchSensor ts;
	
	public WaitTouchSensor(TouchSensor ts) {
		this.ts = ts;
	}
	
	/**
	 * 0 -> pressed
	 * 1 -> released
	 * 2 -> clicked
	 * @param action
	 */
	public void waitTouch(int mode) {
		boolean finish = false;
		boolean pressed = false;
		while(!finish) {
			if(mode == 0) {
				while(!pressed) {
					pressed = ts.isPressed();
				}
				finish = true;
			}else if(mode == 1) {
				if(ts.isPressed()) {
					pressed = true;
					while(pressed) {
						pressed = ts.isPressed();
					}
				}
				finish = true;
			}else {
				while(!pressed) {
					pressed = ts.isPressed();
				}
				while(pressed) {
					pressed = ts.isPressed();
				}
				finish = true;
			}
		}
	}
}
