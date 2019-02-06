
public class WaitMotor {

	private SimpleMotor motor;

	public WaitMotor(SimpleMotor motor) {
		this.motor = motor;
	}
	
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
