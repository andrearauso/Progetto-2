
/**
 * Classe WaitMotor
 * @author Andrea Rauso	
 * @author Peter Catania
 */
public class WaitMotor {

	/**
	 * il motore della classe SimpleMotor
	 */
	private SimpleMotor motor;

	/**
	 * Costruttore con 1 parametro
	 * @param motor il motore della classe SimpleMotor
	 */
	public WaitMotor(SimpleMotor motor) {
		this.motor = motor;
	}
	
	/**
	 * Metodo waitMotorRotation che aspetta un determinato numero di rotazioni del motore
	 * @param rotation il numero di rotazioni
	 */
	public void waitMotorRotation(int rotation) {
		boolean finish = false;
		int previousRotation = this.motor.getMotor().getTachoCount();
		while(!finish) {
			try {
				if(previousRotation + rotation > this.motor.getMotor().getTachoCount()) {
					Thread.sleep(500);
					finish = false;
				}else {
					finish = true;
				}
			}catch(InterruptedException ie) {
				
			}
		}
	}
}
